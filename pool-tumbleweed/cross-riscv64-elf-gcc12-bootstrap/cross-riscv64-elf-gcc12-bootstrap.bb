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

PV = "12.3.0+git1204"

RPM_NAME = "cross-riscv64-elf-gcc12-bootstrap-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "973ce49580ff225fd79ca5554b95d058bcc2aab7edf88a78a4bb3650ab3df3fdd9abd7938c2a6902e13c454270a1dbae7d34132ee277c7266d283baf0955a365"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc12-bootstrap \
cross-riscv64-elf-gcc12-bootstrap(aarch-64) \
riscv64-elf-gcc"

RDEPENDS:${PN} += "/bin/sh \
cross-riscv64-binutils \
update-alternatives"

inherit rpm
