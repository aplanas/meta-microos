SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-riscv64-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "652d6402062809b7fc33ca8ae50dc615897cbc9a5dffcc37562e8b32c8a4c76e6650237a045eba1593819212f746b992aadec7504523452d554f6e6c8de6f3f7"

RPROVIDES:${PN} += "cross-riscv64-gcc13 \
riscv64-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
cross-riscv64-glibc-devel \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
