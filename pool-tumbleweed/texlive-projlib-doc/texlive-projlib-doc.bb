SUMMARY = "Documentation for texlive-projlib"
DESCRIPTION = "This package includes the documentation for texlive-projlib"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65475"

RPM_NAME = "texlive-projlib-doc-2023.209.svn65475-53.1.noarch.rpm"
RPM_HASH = "6864329530934410708559f71c66b2d5b60dbae4d72ae790b9bbb4e9bb7f8dffe5bdd92038bec94e8805dcc31d7b6ac0d6b716e321b50380a4f7ae496e9a44b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-projlib-doc"

RDEPENDS:${PN} += ""

inherit rpm
