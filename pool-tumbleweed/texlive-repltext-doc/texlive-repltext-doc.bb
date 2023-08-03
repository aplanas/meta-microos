SUMMARY = "Documentation for texlive-repltext"
DESCRIPTION = "This package includes the documentation for texlive-repltext"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56433"

RPM_NAME = "texlive-repltext-doc-2023.209.1.1svn56433-54.1.noarch.rpm"
RPM_HASH = "15250e9b2e419278f20fbc3d78940ddbebe185e52f41f9d1a12e788b323f44fe5230e64c7a86310c73f61d61714972ed421358fab575a508a4044c23a1901ce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-repltext-doc"

RDEPENDS:${PN} += ""

inherit rpm
