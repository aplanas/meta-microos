SUMMARY = "CPU emulator for user space"
DESCRIPTION = "QEMU provides CPU emulation along with other related capabilities. This package \
provides programs to run user space binaries and libraries meant for another \
architecture. The syscall interface is intercepted and execution below the \
syscall layer occurs on the native hardware and operating system."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-linux-user-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "7ac84a467607fb01dfb153a6e50e12e6b08001dfac4f5a4cf993f95e968434ecedca97bc56a57bdfb474f1684eaf604861c7f1d51b632b90e8efbae7f935e82f"

RPROVIDES:${PN} += "qemu-linux-user"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
