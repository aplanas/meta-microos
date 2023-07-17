SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-riscv64-elf-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "519b6b6372fae4d0794115a842a7441663600ff5e81d29167916f86c888214b4ad8acca14c9bf5d4389e52ac611b64f95f5ec732b2d16bf7389150fd38d9f68a"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc13 \
riscv64-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
