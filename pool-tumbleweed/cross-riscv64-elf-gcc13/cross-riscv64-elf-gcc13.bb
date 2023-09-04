SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-riscv64-elf-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "d9fa507318aeae07365e105b6fd7e0e2e0ea7f1633b70168e4f2dcd4013d0c351dc536aeb11e3bdc9b9529791e8e157c5d34e273742da204cddc97abe8fd42d7"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc13 \
riscv64-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
