SUMMARY = "Documentation for texlive-gastex"
DESCRIPTION = "This package includes the documentation for texlive-gastex"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn58505"

RPM_NAME = "texlive-gastex-doc-2023.209.3.0svn58505-53.1.noarch.rpm"
RPM_HASH = "1220f6fa40696c40657efe61c950d17a68b3b0cfb17e5471b1a356f36a205607f6d213814c4ac43eb518434f12e6005e17ce36cb99e8933674c2f029004028da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gastex-doc"

RDEPENDS:${PN} += ""

inherit rpm
