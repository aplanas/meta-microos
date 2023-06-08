SUMMARY = "Input device event monitor and query tool"
DESCRIPTION = "evtest displays information on the input device specified on the command line, \
including all the events supported by the device. It then monitors the device \
and displays all the events layer events generated."
LICENSE = "GPL-2.0-or-later"

PV = "1.34"

RPM_NAME = "evtest-1.34-1.10.aarch64.rpm"
RPM_HASH = "7fa95e72f8e577ea6974dcb5b4781729ac77461ceca05a9e8656f33e261c6ff8e8ca3fe318147d9c89908d980c3132f068b857db188d04b8acb71c0ce41d0537"

RPROVIDES:${PN} += "evtest evtest(aarch-64) input-utils:/usr/bin/evtest"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
