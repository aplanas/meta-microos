SUMMARY = "A command-line fuzzy finder"
DESCRIPTION = "fzf is an interactive Unix filter for command-line that can be used with any list; files, \
command history, processes, hostnames, bookmarks, git commits, etc."
LICENSE = "MIT"

PV = "0.42.0"

RPM_NAME = "fzf-0.42.0-1.1.aarch64.rpm"
RPM_HASH = "26152638cf8c922fa91c87c6cccfe2c17591631f92494481a3f2656238282a231c2e5c37206c936d7983d6fdfdce68a229e3adc99bc0bc8d3dd40a6bcf468dd1"

RPROVIDES:${PN} += "fzf"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
