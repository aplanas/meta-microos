SUMMARY = "Documentation for texlive-to-be-determined"
DESCRIPTION = "This package includes the documentation for texlive-to-be-determined"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn64882"

RPM_NAME = "texlive-to-be-determined-doc-2023.209.0.0.3.0svn64882-53.1.noarch.rpm"
RPM_HASH = "029ca97bf810188694bd74c1d84829ba00fc2aa38ddd82b599f95d24806b2d70d30fc26324d07a45c2ea22b6b49f8165105b9ec1d892d3d7572b00d08c4a9fe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-to-be-determined-doc"

RDEPENDS:${PN} += ""

inherit rpm
