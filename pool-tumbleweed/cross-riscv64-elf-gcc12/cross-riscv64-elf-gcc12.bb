SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-riscv64-elf-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "60d8743e796f98d0e33d929feab7f89b3b57d73d85f782fff77f90ca8b1dbd2c317666a94028ab1694b94059ae8ab46fef0cc0f1a7f9797090838d2879736519"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc12 \
riscv64-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
