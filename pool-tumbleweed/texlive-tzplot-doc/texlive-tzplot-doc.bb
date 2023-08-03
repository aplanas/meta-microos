SUMMARY = "Documentation for texlive-tzplot"
DESCRIPTION = "This package includes the documentation for texlive-tzplot"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn64537"

RPM_NAME = "texlive-tzplot-doc-2023.209.2.1svn64537-53.1.noarch.rpm"
RPM_HASH = "94a97cb4c535e6f69473609be4b398aefb319462a5f4da73fcf7a8dc9cf5e411a15b67c30f1f22c9ac964b792ace926f56a2a5119fc8dfee5e732e4ba3d80e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tzplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
