SUMMARY = "The terminfo file for the Kitty terminal"
DESCRIPTION = "Provides 'xterm-kitty' terminfo file(s) for the Kitty terminal; this package can be installed on its own to provide file(s) instead of the full kitty package on remote systems."
LICENSE = "GPL-3.0-only"

PV = "0.29.2"

RPM_NAME = "kitty-terminfo-0.29.2-1.1.noarch.rpm"
RPM_HASH = "6f81a318c7f012f0a379eee4044a78caf625293ce3f807b018496f4f73763b21d02ee84dc43eb094663dbf071149d072e518dbf9c69fee1b572e26c9266eb87b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kitty-terminfo"

RDEPENDS:${PN} += ""

inherit rpm
