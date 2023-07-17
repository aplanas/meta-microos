SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-riscv64-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "d744b3cb373eb36fb84430fdeea538a72c693c37362fa56c58d7b70e3f2c57dbb8b2f1f0407314429aca58c7d840054841385fc14a75f72902a6bf3d63cdbc2b"

RPROVIDES:${PN} += "cross-riscv64-gcc13 \
riscv64-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
cross-riscv64-glibc-devel \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
