SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-riscv64-elf-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "65e51c97edb355a8665803fe034bd91b252d3b4c8492704d84c0b52f88f2353ab77ae4452d61fc1d3e4e343fb423c667fb68fa9bb66255ed8a3374c9fbfa3f27"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc13 cross-riscv64-elf-gcc13(aarch-64) riscv64-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-riscv64-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
