SUMMARY = "Utilities for managing processes on your system"
DESCRIPTION = "The psmisc package contains utilities for managing processes on your \
system: pstree, killall and fuser.  The pstree command displays a tree \
structure of all of the running processes on your system.  The killall \
command sends a specified signal (SIGTERM if nothing is specified) to \
processes identified by name.  The fuser command identifies the PIDs of \
processes that are using specified files or filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "23.6"

RPM_NAME = "psmisc-23.6-3.4.aarch64.rpm"
RPM_HASH = "77087977bd3e8d9803f328cd0f758d8881ed350e7da07ac6c7b23db220f37d0701d662d63473864f38d8ae6075eb14ab5bf7fd06cef5b0d4c893d9a08203418c"

RPROVIDES:${PN} += "/usr/bin/fuser \
ps-/usr/bin/killall \
psmisc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
