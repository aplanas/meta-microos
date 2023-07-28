SUMMARY = "CPU emulator for user space"
DESCRIPTION = "QEMU provides CPU emulation along with other related capabilities. This package \
provides programs to run user space binaries and libraries meant for another \
architecture. The syscall interface is intercepted and execution below the \
syscall layer occurs on the native hardware and operating system."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-linux-user-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "f1f0f2ba7bd392f4401f1351bc762315783aff70db6595b4e956ea6db26bad482cb3b19899167d97ac4379580435caa486baa2ef93cd38f070786989483d4522"

RPROVIDES:${PN} += "qemu-linux-user"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
