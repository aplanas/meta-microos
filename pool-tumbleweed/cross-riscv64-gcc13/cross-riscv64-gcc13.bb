SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-riscv64-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "28781d4144f2712bfbc6ad941fceb63d0859e6669713ae321a71421763f0f8a5cc9387f6088d318a1c0e8f8cf5dbcd164564a69645c91956716bd22df17087c4"

RPROVIDES:${PN} += "cross-riscv64-gcc13 \
riscv64-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
cross-riscv64-glibc-devel \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
