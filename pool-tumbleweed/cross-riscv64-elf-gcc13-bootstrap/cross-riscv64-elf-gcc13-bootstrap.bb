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

RPM_NAME = "cross-riscv64-elf-gcc13-bootstrap-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "08255b66025fcc9690417556fa050c81e5f9911f417742cb9bef84cae968380b0bd1e6ba9ece7ce08f28b71aff87fab18875a0d9ceea5eed576d1c4850e0c645"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc13-bootstrap \
riscv64-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
update-alternatives"

inherit rpm
