SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-riscv64-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "20a56db358ee0c4bd8d95fd72d8b3f98ae26a3e5cdcf43961b91373e93829dea5bb3d710f4f2a1b04768f8a06d7c4941d2dca56f8c30416a3e22be71403ae716"

RPROVIDES:${PN} += "cross-riscv64-gcc11 cross-riscv64-gcc11(aarch-64) riscv64-suse-linux-gcc"
RDEPENDS:${PN} += "/bin/sh cross-riscv64-binutils cross-riscv64-glibc-devel libstdc++6-devel-gcc11 update-alternatives"

inherit rpm
