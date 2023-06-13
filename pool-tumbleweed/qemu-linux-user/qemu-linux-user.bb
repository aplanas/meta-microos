SUMMARY = "CPU emulator for user space"
DESCRIPTION = "QEMU provides CPU emulation along with other related capabilities. This package \
provides programs to run user space binaries and libraries meant for another \
architecture. The syscall interface is intercepted and execution below the \
syscall layer occurs on the native hardware and operating system."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-linux-user-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "693861f0ecc11e848c0488b8688d0281d6c918494fe2e7000a01339bd1fb1dfbee50cd6e169f26a218463f78f446845ce64e56bb4984e7940c0b4d6a2dac5b90"

RPROVIDES:${PN} += "qemu-linux-user \
qemu-linux-user(aarch-64)"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
