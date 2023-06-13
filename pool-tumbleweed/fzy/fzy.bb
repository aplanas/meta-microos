SUMMARY = "A fuzzy text selector"
DESCRIPTION = "fzy can be used to filter any list: files, command history, processes, \
hostnames, bookmarks, git commits, etc. It's designed to be used both as an \
editor plugin and on the command line. Rather than clearing the screen, fzy \
displays its interface directly below the current cursor position, scrolling \
the screen if necessary."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "fzy-1.0-1.16.aarch64.rpm"
RPM_HASH = "504df92458b227c4cba60f5012a1b55d6c5c0039c0471e117c9ec0d1b60f07d17191aedef86742d689f182af432eab6af6bcfe7ab19b2d2e7a37f91ecde053a3"

RPROVIDES:${PN} += "fzy \
fzy(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
