SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-riscv64-elf-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "23466dddf72e96a7c1c464a3935d33bedb9d67e5b8f716629810660462ec32e798a167cf8f54599633010935707f6b3f985f56ebc49ce368e06cb6ba0c5c66f6"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc13 \
riscv64-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
