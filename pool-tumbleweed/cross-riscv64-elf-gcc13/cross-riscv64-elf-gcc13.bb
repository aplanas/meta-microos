SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-riscv64-elf-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "2fba5ea90919cb8e01939130b9941d67d44eda6a1276048f94f68713727b4827b72494ff0af016c67e5cf1a48ea3aa6343f18a640cfcf4f5d5bd7907e0a54099"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc13 \
riscv64-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
