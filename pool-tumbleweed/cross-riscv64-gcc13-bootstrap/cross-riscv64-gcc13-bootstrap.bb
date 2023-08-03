SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-riscv64-gcc13-bootstrap-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "1119b734ded5a773e39eae20e50f612f42e719782d724acbba8dfb03d58cef77e5301b31b8e41fcb6769484f6f8d7637d867f20f483a9d32baf8661a95b13703"

RPROVIDES:${PN} += "cross-riscv64-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
update-alternatives"

inherit rpm
