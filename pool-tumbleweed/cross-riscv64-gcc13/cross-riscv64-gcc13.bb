SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-riscv64-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "8ab85ae03f0a7d8232af0812d4d8c3a482c56254cc5ea36f6d4b996e4dbace01e9ae6610214f36aea55f83fe020a6a64d5fdd87bf7b0d7db5bc9d469e1c60dfa"

RPROVIDES:${PN} += "cross-riscv64-gcc13 \
riscv64-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
cross-riscv64-glibc-devel \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
