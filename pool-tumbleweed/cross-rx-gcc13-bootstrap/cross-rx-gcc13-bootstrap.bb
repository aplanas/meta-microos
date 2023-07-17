SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-rx-gcc13-bootstrap-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "0568605e548eb930e1d9a67e6dd91472f24c8f4234da381fbd9d52c0f3b99ab5ec9321ef6ac2be5356994ff912ee3dbf20c3e741630ebb8c647b015bc0441ad9"

RPROVIDES:${PN} += "cross-rx-gcc13-bootstrap \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
update-alternatives"

inherit rpm
