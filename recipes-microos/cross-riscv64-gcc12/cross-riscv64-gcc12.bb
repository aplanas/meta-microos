SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-riscv64-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "e201913bfd3869b25a96f2c608a18ee072456f1c2c983b1adbba80def64294c9bb0646b7b93aaaf3238189eaebb7ff31793a5e7a8581b900f952471952245e53"

RPROVIDES:${PN} += "cross-riscv64-gcc12 cross-riscv64-gcc12(aarch-64) riscv64-suse-linux-gcc"
RDEPENDS:${PN} += "/bin/sh cross-riscv64-binutils cross-riscv64-glibc-devel libstdc++6-devel-gcc12 update-alternatives"

inherit rpm
