SUMMARY = "CPU emulator for user space"
DESCRIPTION = "QEMU provides CPU emulation along with other related capabilities. This package \
provides programs to run user space binaries and libraries meant for another \
architecture. The syscall interface is intercepted and execution below the \
syscall layer occurs on the native hardware and operating system."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-linux-user-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "3b9346bd2333c205533d1eeb62d3e34a0265e0b9ab1fd89a2c42aac7523a80141bfa520d8f77076532c446cfd207f4b1a46378e8411e35c21f3f5f98618e378c"

RPROVIDES:${PN} += "qemu-linux-user"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
