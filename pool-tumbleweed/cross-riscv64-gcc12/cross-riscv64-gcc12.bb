SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-riscv64-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "5b6a5b47b6051abae284583544ea9d519a52016627904d27f5f8cd04c55edd5cdced611befe8fb46dd81f3fdc593e0cc4b97658b7adee5723b2ed30860c4bece"

RPROVIDES:${PN} += "cross-riscv64-gcc12 \
riscv64-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
cross-riscv64-glibc-devel \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
