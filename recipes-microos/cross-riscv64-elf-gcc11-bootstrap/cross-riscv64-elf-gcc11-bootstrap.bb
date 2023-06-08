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

PV = "11.3.1+git2076"

RPM_NAME = "cross-riscv64-elf-gcc11-bootstrap-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "2a7ca51d05f75d7b8e0532b5b1c9cae268617133eb2aa21ce3d7524ba8fd5377f3144d644cf93dd98f9ae58d7ed42bea7e384ab4011f60c265335d5bde64f713"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc11-bootstrap cross-riscv64-elf-gcc11-bootstrap(aarch-64) riscv64-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-riscv64-binutils update-alternatives"

inherit rpm
