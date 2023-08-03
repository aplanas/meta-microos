SUMMARY = "Documentation for texlive-tinos"
DESCRIPTION = "This package includes the documentation for texlive-tinos"
LICENSE = "Apache-1.0"

PV = "2023.209.svn64504"

RPM_NAME = "texlive-tinos-doc-2023.209.svn64504-53.1.noarch.rpm"
RPM_HASH = "d016a7f5ec47a7a4cba4bb8a0e0ac3e7998c4b41c70128ffec2a35b6b0b0353231631a638ea982fb4028c3f085c8c5951a685015b225c3602a6c6b252c93793e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tinos-doc"

RDEPENDS:${PN} += ""

inherit rpm
