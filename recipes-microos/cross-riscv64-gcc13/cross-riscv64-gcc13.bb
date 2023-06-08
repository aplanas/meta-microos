SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-riscv64-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "e5d87752e858ea697b42e70bbbc1e014e8fd5ebdff07b600da2f8b9c6507cbb21d396a5ab12e15675974aa203d12fe1c045c49148a76321dfc991ba6fcee0db9"

RPROVIDES:${PN} += "cross-riscv64-gcc13 cross-riscv64-gcc13(aarch-64) riscv64-suse-linux-gcc"
RDEPENDS:${PN} += "/bin/sh cross-riscv64-binutils cross-riscv64-glibc-devel libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
