SUMMARY = "The terminfo file for the Kitty terminal"
DESCRIPTION = "Provides 'xterm-kitty' terminfo file(s) for the Kitty terminal; this package can be installed on its own to provide file(s) instead of the full kitty package on remote systems."
LICENSE = "GPL-3.0-only"

PV = "0.29.1"

RPM_NAME = "kitty-terminfo-0.29.1-1.1.noarch.rpm"
RPM_HASH = "5a57cb1613755ba34746f2c9672d3ded40d22f4eaeedb812bfa4992a8f43a3e291fd2889860528f2f628b2d67fb26dc1dbc50fb45e8c2f3bb194c4b475e7baea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kitty-terminfo"

RDEPENDS:${PN} += ""

inherit rpm
