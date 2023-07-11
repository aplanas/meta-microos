SUMMARY = "The GNU Compiler Collection targeting m68k"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting m68k. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-m68k-gcc7-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "51116a7f711ad56c89d25081f2d1892c762de02b5f24320f3f5eef220282e7b6199e1269a709dcb2e92f07b689d44436b4b45e87d136cf7a99b94f68fe34b698"

RPROVIDES:${PN} += "cross-m68k-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-m68k-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
