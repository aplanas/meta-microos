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

RPM_NAME = "ltrace-0.7.91-14.1.aarch64.rpm"
RPM_HASH = "052b1428e3c5b3b4672449c60f33490a2bf48c9b895872965271daf6a63aab3c027b37eacc70d576c2dc94e1d3fc7627952a78011f700935045fe904d17112c1"

RPROVIDES:${PN} += "ltrace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1"

inherit rpm
