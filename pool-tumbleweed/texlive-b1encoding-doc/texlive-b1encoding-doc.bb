SUMMARY = "Documentation for texlive-b1encoding"
DESCRIPTION = "This package includes the documentation for texlive-b1encoding"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21271"

RPM_NAME = "texlive-b1encoding-doc-2023.209.1.0svn21271-54.1.noarch.rpm"
RPM_HASH = "4ae490f233cb47e2d43bc6b6de28165fdb707d693bc0ce86d8d1ad0da24d8ff5d0e9b91972bb59fb241d41e36a4b4806b2901a5ce60b0faf4e5b18690b3ed0c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-b1encoding-doc"

RDEPENDS:${PN} += ""

inherit rpm
