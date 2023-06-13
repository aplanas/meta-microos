SUMMARY = "Utilities for managing processes on your system"
DESCRIPTION = "The psmisc package contains utilities for managing processes on your \
system: pstree, killall and fuser.  The pstree command displays a tree \
structure of all of the running processes on your system.  The killall \
command sends a specified signal (SIGTERM if nothing is specified) to \
processes identified by name.  The fuser command identifies the PIDs of \
processes that are using specified files or filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "23.6"

RPM_NAME = "psmisc-23.6-3.3.aarch64.rpm"
RPM_HASH = "e196cc3c456c21a572f78e40c2a39b56dca386e3c1e85343f3ea9c1e0d458208d08359f8631278a5e25779ed962da06c1660d0198780257d07cd493076264237"

RPROVIDES:${PN} += "/bin/fuser \
ps:/usr/bin/killall \
psmisc \
psmisc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
