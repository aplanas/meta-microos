SUMMARY = "Documentation for texlive-pst-turtle"
DESCRIPTION = "This package includes the documentation for texlive-pst-turtle"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn52261"

RPM_NAME = "texlive-pst-turtle-doc-2023.209.0.0.02svn52261-54.2.noarch.rpm"
RPM_HASH = "cc2aa21377fccf8a6adc472bd2399000973fa0054668741dc17f8c5364d5ce35d46e69450d380dc0d06ec3a23567ca730c40a24861189a11d31a6f40230df46e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-turtle-doc"

RDEPENDS:${PN} += ""

inherit rpm
