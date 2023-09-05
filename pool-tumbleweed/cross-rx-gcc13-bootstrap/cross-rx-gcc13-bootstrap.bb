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

PV = "13.2.1+git7683"

RPM_NAME = "cross-rx-gcc13-bootstrap-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "705abe07a35e20579afec98dbadda2d03bbb1cc898f905702a65e157b6d30303624a3647ee91899f577d0b470c73fe4c143eba8dfad599be4a194fdfb66c7060"

RPROVIDES:${PN} += "cross-rx-gcc13-bootstrap \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
update-alternatives"

inherit rpm
