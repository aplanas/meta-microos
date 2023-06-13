SUMMARY = "Documentation for texlive-plex"
DESCRIPTION = "This package includes the documentation for texlive-plex"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64496"

RPM_NAME = "texlive-plex-doc-2023.201.svn64496-52.1.noarch.rpm"
RPM_HASH = "2be121949451ffe1bf5a2ec0726d3fb048ded85d4da4a7848b9ba5686f1ca476097c0dff7d4688f9f71dfefa7e51dbcb5e4c5dbef899fd17038ff642b7064d2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plex-doc"

RDEPENDS:${PN} += ""

inherit rpm
