SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-epiphany-gcc12-bootstrap-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "8291d677cbc8fd62d63ca0e42cb44b26d6a996089ce34bb7df04f6311377bc835b2a6fe307609e1f1038fceded653550bafc7f3173c55e55744f705f3489209b"

RPROVIDES:${PN} += "cross-epiphany-gcc12-bootstrap \
epiphany-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-epiphany-binutils \
update-alternatives"

inherit rpm
