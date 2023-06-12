SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-riscv64-elf-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "eb936f65b3def9464b2567bf502043d7cb46998f09a7a8fa3fea77b2fbc4e6ae9e7732c755cbd0c0f9c1f8c80f90445e9e082d6b76dfa711f80978476408bdfe"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc13 \
cross-riscv64-elf-gcc13(aarch-64) \
riscv64-elf-gcc"
RDEPENDS:${PN} += "/bin/sh \
cross-riscv64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
