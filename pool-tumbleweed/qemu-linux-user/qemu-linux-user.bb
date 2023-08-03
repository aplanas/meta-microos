SUMMARY = "CPU emulator for user space"
DESCRIPTION = "QEMU provides CPU emulation along with other related capabilities. This package \
provides programs to run user space binaries and libraries meant for another \
architecture. The syscall interface is intercepted and execution below the \
syscall layer occurs on the native hardware and operating system."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-linux-user-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "845742aaa6bc4cc1ab2a72593cc23d28dc8d64bb27c9a25056b8c62a8b717eb6bb5b1804a416bd6677670daa5693a3efaae592af65b7efc418f2cc58ae0af0db"

RPROVIDES:${PN} += "qemu-linux-user"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
