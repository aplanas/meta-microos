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

RPM_NAME = "cross-rx-gcc7-bootstrap-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "0898781fd370145ac516a9e00c7e4b8639f50a9683ca7a17e8799d9d8ffd36e4836da482d1a1caecf244d14b36b0540f6ebb12e5e9e429a13a8abc7e016fee6e"

RPROVIDES:${PN} += "cross-rx-gcc7-bootstrap \
liblto-plugin.so.0 \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
