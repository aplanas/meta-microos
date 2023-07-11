SUMMARY = "Library for Handling Page Faults in User Mode"
DESCRIPTION = "This is a library for handling page faults in user mode. A page fault occurs \
when a program tries to access to a region of memory that is currently not \
available."
LICENSE = "GPL-2.0-or-later"

PV = "2.14"

RPM_NAME = "libsigsegv2-2.14-2.10.aarch64.rpm"
RPM_HASH = "02f6ad4b5a795e04e21def76c6c7731605ba740552a288703057ba5d25867dc00840b743a71ef085acc466d07af8aaf21d00d856be2182603d4d14818eb1deb9"

RPROVIDES:${PN} += "libsigsegv.so.2 \
libsigsegv2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
