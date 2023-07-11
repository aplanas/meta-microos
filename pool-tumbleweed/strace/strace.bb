SUMMARY = "A utility to trace the system calls of a program"
DESCRIPTION = "With strace, you can trace the activity of a program.  Information \
about any system calls the program makes and the signals it receives \
and processes can be seen.  Child processes can also be tracked."
LICENSE = "BSD-3-Clause"

PV = "6.4"

RPM_NAME = "strace-6.4-1.1.aarch64.rpm"
RPM_HASH = "dcf21504b5624065b24ee2541b6b18dbe7fe7343bd980e17c5040034c78071da58d5b9c3608a11dfa57ecf8518d8bc43557ad5ee4ae7d94705b2e42daa511401"

RPROVIDES:${PN} += "strace"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1"

inherit rpm
