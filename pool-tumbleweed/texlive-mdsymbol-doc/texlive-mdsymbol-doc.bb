SUMMARY = "Documentation for texlive-mdsymbol"
DESCRIPTION = "This package includes the documentation for texlive-mdsymbol"
LICENSE = "OFL-1.1"

PV = "2023.208.0.0.5svn28399"

RPM_NAME = "texlive-mdsymbol-doc-2023.208.0.0.5svn28399-53.1.noarch.rpm"
RPM_HASH = "5c7c5fbd702ecd971e46b09a34e2675d706c77753f325df38fa338f2461f8d8a73c2c58aab4ddb3d67f7f96cf6b96fa572b48e47df793ed33192741bcc9efa19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mdsymbol-doc"

RDEPENDS:${PN} += ""

inherit rpm
