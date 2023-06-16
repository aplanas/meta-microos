SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-riscv64-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "49576b87c38b62f68cb0d1016c9f4a843f2f16f879f9660ceca13433e82a93480562397eb2adc8cf6a345ee1414032d7eee54d1bdaa36b22eb412076916f5b40"

RPROVIDES:${PN} += "cross-riscv64-gcc13 \
riscv64-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
cross-riscv64-glibc-devel \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
