SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-riscv64-elf-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "866c497f7bb282c26dc8d988f1441a6a61e91ef0062616c9b0374a1348e99790a659aa5e6628d66805c9ed7930c2ebdb332383a9f743169894fe9e331a50a422"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc13 \
riscv64-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
