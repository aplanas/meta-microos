SUMMARY = "The terminfo file for the Kitty terminal"
DESCRIPTION = "Provides 'xterm-kitty' terminfo file(s) for the Kitty terminal; this package can be installed on its own to provide file(s) instead of the full kitty package on remote systems."
LICENSE = "GPL-3.0-only"

PV = "0.29.0"

RPM_NAME = "kitty-terminfo-0.29.0-1.1.noarch.rpm"
RPM_HASH = "02b7919678a0e4f596c0043145bab434889dfe11ebd4655a694577f55bbc2a5b30ea318a7a6cb361c91f311341ad433a9ef4824dc9b017ee9e2f4dfa1bd65c21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kitty-terminfo"

RDEPENDS:${PN} += ""

inherit rpm
