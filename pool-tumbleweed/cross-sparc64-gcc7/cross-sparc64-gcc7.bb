SUMMARY = "The GNU Compiler Collection targeting sparc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparc64-gcc7-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "82ece10759ea0e26a22f0de6843c5fa0ef5beca2269ef87ff53c5e45066da9581fa120aef687de4334cc8738ea7c421ec2640720145d8ccdf5eb0ef1694e9150"

RPROVIDES:${PN} += "cross-sparc64-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc64-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
