SUMMARY = "The shell-integation file(s) for the Kitty terminal"
DESCRIPTION = "shell-integration [bash,fish,zsh] file(s) for the Kitty terminal; this package can be installed on its own to provide file(s) instead of the full kitty package on remote systems."
LICENSE = "GPL-3.0-only"

PV = "0.29.1"

RPM_NAME = "kitty-shell-integration-0.29.1-1.1.aarch64.rpm"
RPM_HASH = "aedd8f3eec621733b8d9dca9f4a1477a841ad24d704cdd2c3bd129fadca7ea315b6a49c7ecf376a4b3010cf605076fc69f8ebcec86062fb815384397f110d3b7"

RPROVIDES:${PN} += "kitty-shell-integration"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
