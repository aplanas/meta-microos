SUMMARY = "Documentation for texlive-xecjk"
DESCRIPTION = "This package includes the documentation for texlive-xecjk"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.9.1svn64059"

RPM_NAME = "texlive-xecjk-doc-2023.209.3.9.1svn64059-53.1.noarch.rpm"
RPM_HASH = "5abfa24aa45b78155129d1e91433150d228a0f87e0d86e21d64f6df660ed86a41dbd8afc01fbaec979649b23261d5a790a5e630a572011ced80183ba8f1a6c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xecjk-doc-zh \
texlive-xecjk-doc"

RDEPENDS:${PN} += ""

inherit rpm
