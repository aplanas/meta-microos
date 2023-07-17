SUMMARY = "The shell-integation file(s) for the Kitty terminal"
DESCRIPTION = "shell-integration [bash,fish,zsh] file(s) for the Kitty terminal; this package can be installed on its own to provide file(s) instead of the full kitty package on remote systems."
LICENSE = "GPL-3.0-only"

PV = "0.29.0"

RPM_NAME = "kitty-shell-integration-0.29.0-1.1.aarch64.rpm"
RPM_HASH = "e2972ef7444b9ca0337f8b3f79f6a4e688816c294f2128afe3fd01c9cfb14590308d3ae1cb8f0d2fe5b781e35c52a084dc6e14985796173e2bf8b424c0dfda60"

RPROVIDES:${PN} += "kitty-shell-integration"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
