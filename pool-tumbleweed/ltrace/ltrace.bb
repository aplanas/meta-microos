SUMMARY = "Library and system call tracer for programs"
DESCRIPTION = "Ltrace is a program that runs the specified command until it exits. It \
intercepts and records the dynamic library calls that are called by the \
executed process and the signals that are received by that process. It \
can also intercept and print the system calls executed by the program. \
 \
The program to trace need not be recompiled for this, so ltrace can be \
used on binaries for which no source is available. \
 \
This is still a work in progress, so, for example, the tracking to \
child processes may fail or some things may not work as expected."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.91"

RPM_NAME = "ltrace-0.7.91-14.2.aarch64.rpm"
RPM_HASH = "aed1871e1100fd35336745d75b7d59ba2b583dde14772247f2ee16cfd1f402c6465dccbad7b2c84bc0bcc1c1b083891280785fb7c2299ef60a64b062e08704cc"

RPROVIDES:${PN} += "ltrace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1"

inherit rpm
