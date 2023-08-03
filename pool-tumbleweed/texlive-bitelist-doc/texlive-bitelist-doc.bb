SUMMARY = "Documentation for texlive-bitelist"
DESCRIPTION = "This package includes the documentation for texlive-bitelist"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn25779"

RPM_NAME = "texlive-bitelist-doc-2023.209.0.0.1svn25779-53.1.noarch.rpm"
RPM_HASH = "37190da74fab4f21bfe1c4afda90030539e738fcfc206a56e14560714da55cfc3d4801795b75ca52c0765fef4b9a2f8fcb46a68d768c7f2bb9fa9aa10a4cfb58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bitelist-doc"

RDEPENDS:${PN} += ""

inherit rpm
