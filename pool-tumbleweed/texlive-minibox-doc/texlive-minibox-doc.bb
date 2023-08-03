SUMMARY = "Documentation for texlive-minibox"
DESCRIPTION = "This package includes the documentation for texlive-minibox"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2asvn30914"

RPM_NAME = "texlive-minibox-doc-2023.209.0.0.2asvn30914-55.1.noarch.rpm"
RPM_HASH = "ee77264cdb0cb4797416d8253753d98610e22a5395503de19b159b65c22c2c29d66318820873027c6a6dc55deebfe4a199494374815af2782cfad0c461b3d932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minibox-doc"

RDEPENDS:${PN} += ""

inherit rpm
