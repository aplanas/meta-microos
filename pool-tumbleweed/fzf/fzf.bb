SUMMARY = "A command-line fuzzy finder"
DESCRIPTION = "fzf is an interactive Unix filter for command-line that can be used with any list; files, \
command history, processes, hostnames, bookmarks, git commits, etc."
LICENSE = "MIT"

PV = "0.41.0"

RPM_NAME = "fzf-0.41.0-1.1.aarch64.rpm"
RPM_HASH = "ff782d463d6866dcd4086381f0006afc2597bb6543008d5f95ac6df218a8f97ea1d4fe0874a262a1bbfd403ffa8b966ae535c54fa23b6f14c594f7b7039e2f56"

RPROVIDES:${PN} += "fzf \
fzf(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
