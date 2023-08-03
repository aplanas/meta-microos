SUMMARY = "Documentation for texlive-clrscode"
DESCRIPTION = "This package includes the documentation for texlive-clrscode"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn51136"

RPM_NAME = "texlive-clrscode-doc-2023.209.1.7svn51136-54.1.noarch.rpm"
RPM_HASH = "7ff3073f73708ee3abdd3002e75428e4372e58b84602edb0d5cfd3e153ccd7ff5c8e30bf52e9ac1813ff12f398d01dc4e5c0c41f39165196f0f2df9df0d460e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clrscode-doc"

RDEPENDS:${PN} += ""

inherit rpm
