SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-riscv64-elf-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "d98c8fee666ff75d2a03ef1c2bd4027899760d31a31e2a1cf45906a8c0228ecb708c609b49c38e475f95f1b518336d0c87793a236cc247c44de5d6fafa3625ec"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc11 cross-riscv64-elf-gcc11(aarch-64) riscv64-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-riscv64-binutils libstdc++6-devel-gcc11 update-alternatives"

inherit rpm
