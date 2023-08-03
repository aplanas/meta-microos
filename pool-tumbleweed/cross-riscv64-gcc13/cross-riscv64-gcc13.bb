SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-riscv64-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "e977cb46ce2f4914d3868ddd882533d84a29705c6de962a0984c27e1b091e01c5707024b7becf390e62ae68c2aecda997eed5ba688fa4f5c727c026ab7a5206e"

RPROVIDES:${PN} += "cross-riscv64-gcc13 \
riscv64-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
cross-riscv64-glibc-devel \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
