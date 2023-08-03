SUMMARY = "The shell-integation file(s) for the Kitty terminal"
DESCRIPTION = "shell-integration [bash,fish,zsh] file(s) for the Kitty terminal; this package can be installed on its own to provide file(s) instead of the full kitty package on remote systems."
LICENSE = "GPL-3.0-only"

PV = "0.29.2"

RPM_NAME = "kitty-shell-integration-0.29.2-1.1.aarch64.rpm"
RPM_HASH = "8a0429c2425a68b97135fcacdbf485fca2d8e13a588e6125f1654cf5010ca668f2d951b093b663f6ce48d5b90df7dbca7fe80d4750011d96f4c30a89a793e60b"

RPROVIDES:${PN} += "kitty-shell-integration"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
