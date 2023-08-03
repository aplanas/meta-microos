SUMMARY = "Documentation for texlive-yfonts-t1"
DESCRIPTION = "This package includes the documentation for texlive-yfonts-t1"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36013"

RPM_NAME = "texlive-yfonts-t1-doc-2023.209.1.0svn36013-53.1.noarch.rpm"
RPM_HASH = "48f914fd55b6ab3204eaa3b00e6f4e499a4454337449f56bb59fee5ea85fb0882b2bb1a12774357039140cee21366e2f6796d8b728283a1810c0edf7a8d3ab36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yfonts-t1-doc"

RDEPENDS:${PN} += ""

inherit rpm
