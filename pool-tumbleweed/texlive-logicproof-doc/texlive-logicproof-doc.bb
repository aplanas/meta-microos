SUMMARY = "Documentation for texlive-logicproof"
DESCRIPTION = "This package includes the documentation for texlive-logicproof"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn33254"

RPM_NAME = "texlive-logicproof-doc-2023.209.svn33254-55.1.noarch.rpm"
RPM_HASH = "8ec8bb639186f227509a4b06b735933f8bf585408dee947adaa5571abc2e61a3d5ddc3625e1dbc7a3b64644f31f4c9e2ba14cf7a74739474c71ac9e05a5d06a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logicproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
