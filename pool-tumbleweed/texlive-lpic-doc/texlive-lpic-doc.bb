SUMMARY = "Documentation for texlive-lpic"
DESCRIPTION = "This package includes the documentation for texlive-lpic"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn20843"

RPM_NAME = "texlive-lpic-doc-2023.201.0.0.8svn20843-54.1.noarch.rpm"
RPM_HASH = "74db683b20cb04fe2aa08b79c74eb996edeb05eb0e0ccf65ed8b6117c9f0b0868a3d362e8ec6a03832d4b82d76f399327c624fec9b3416e0a7a3dcd121da1f7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
