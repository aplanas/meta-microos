SUMMARY = "A fuzzy text selector"
DESCRIPTION = "fzy can be used to filter any list: files, command history, processes, \
hostnames, bookmarks, git commits, etc. It's designed to be used both as an \
editor plugin and on the command line. Rather than clearing the screen, fzy \
displays its interface directly below the current cursor position, scrolling \
the screen if necessary."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "fzy-1.0-1.17.aarch64.rpm"
RPM_HASH = "11b5fc04248a600c45f402fd3849cea10bc6b179cc2a698e71ba067ea477e410d3f8abebed604dc3d66b08896f0d1527538efb3b7266414966dee50a76682e6b"

RPROVIDES:${PN} += "fzy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
