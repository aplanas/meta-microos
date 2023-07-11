SUMMARY = "The GNU Compiler Collection targeting mips"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting mips. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-mips-gcc7-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "a531ee7abcf43254defabf66cc78c785182ad52b356c3f837bc29fcf70e7be3c28a5906809bfe544b588f200107823c8ce634499b1de95009a7a74e3b4c28c8f"

RPROVIDES:${PN} += "cross-mips-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-mips-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
