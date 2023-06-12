SUMMARY = "SuperCollider support for Vim"
DESCRIPTION = "SuperCollider support for the Vim text editor."
LICENSE = "GPL-3.0-only"

PV = "3.13.0"

RPM_NAME = "supercollider-vim-3.13.0-1.3.aarch64.rpm"
RPM_HASH = "4023782295e5af68722b4dc5426377b9c255448a61234e7523abe0e7055b7c0b9bdd06414c1f5d59237b35d5e826757e7d40b12ef470234425ee0020c88f068a"

RPROVIDES:${PN} += "supercollider-vim \
supercollider-vim(aarch-64)"
RDEPENDS:${PN} += "supercollider"

inherit rpm
