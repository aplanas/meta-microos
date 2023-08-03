SUMMARY = "Documentation for texlive-lithuanian"
DESCRIPTION = "This package includes the documentation for texlive-lithuanian"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66461"

RPM_NAME = "texlive-lithuanian-doc-2023.209.svn66461-55.1.noarch.rpm"
RPM_HASH = "240f6a7033af67edb48558742b0f5da9c08a9b05b077cdb9eb6ca0a2b7163864473b1cfd6f8c15951f44953ac3dcfe1f48dbe2ce90d3c9f4614fc4a61a622a33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lithuanian-doc"

RDEPENDS:${PN} += ""

inherit rpm
