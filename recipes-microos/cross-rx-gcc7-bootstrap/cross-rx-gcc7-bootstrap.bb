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

PV = "7.5.0+r278197"

RPM_NAME = "cross-rx-gcc7-bootstrap-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "4c8619a4af643e910975b89e49f7ddb02a2283ae98c88b0b7c940dfc508658a3dc47f8ba68d5d51f34462275aa04d3cb68f41ccb06c5b486c8d0ffd8d6793638"

RPROVIDES:${PN} += "cross-rx-gcc7-bootstrap \
cross-rx-gcc7-bootstrap(aarch-64) \
liblto_plugin.so.0()(64bit) \
rx-elf-gcc"
RDEPENDS:${PN} += "/bin/sh \
cross-rx-binutils \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
update-alternatives"

inherit rpm
