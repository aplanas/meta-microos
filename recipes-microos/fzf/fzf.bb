SUMMARY = "A command-line fuzzy finder"
DESCRIPTION = "fzf is an interactive Unix filter for command-line that can be used with any list; files, \
command history, processes, hostnames, bookmarks, git commits, etc."
LICENSE = "MIT"

PV = "0.40.0"

RPM_NAME = "fzf-0.40.0-1.1.aarch64.rpm"
RPM_HASH = "4273be0993d8de5fd03b6042f8cfde0f401bc91f4052e7243d6644f107d67eafbe7dcabda72eb0b46accc02974150106d728515a516c4099f1f8405186da29c9"

RPROVIDES:${PN} += "fzf fzf(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
