SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-riscv64-elf-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "9fe0f9468f67a7f8049fa91cdd223a1a8cf81248b0240f2994fad969b3f306068225c3b9100b88c32b382a1dbb9d9862631c08ca584aa00d4db7777f53df5cfc"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc12 cross-riscv64-elf-gcc12(aarch-64) riscv64-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-riscv64-binutils libstdc++6-devel-gcc12 update-alternatives"

inherit rpm
