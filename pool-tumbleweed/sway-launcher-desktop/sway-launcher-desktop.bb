SUMMARY = "TUI Application launcher with Desktop Entry support"
DESCRIPTION = "This is a TUI-based launcher menu made with bash and the amazing fzf. Despite its name, it does not depend on the Sway window manager can be used with just about any WM."
LICENSE = "GPL-3.0-only"

PV = "1.6.0"

RPM_NAME = "sway-launcher-desktop-1.6.0-1.3.noarch.rpm"
RPM_HASH = "b90ecc24216cd6f9d8910e2a6efbe2ee00397d96f0943c894db5ac0f7b0052f5026694c5a860ca3a872967c0332fbd3760b2be2799fef726d6d87dcbadfc40a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sway-launcher-desktop"

RDEPENDS:${PN} += "/usr/bin/bash \
fzf"

inherit rpm
