SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-x86_64-gcc7-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "98b4bd46dab8f0f8d7d4aef15d2302f5fb76ca5a35bea7e278f5a76519208904679d0945d6f850ebbefa00c8a1237917724c91fffb3d83600a1848603ab28927"

RPROVIDES:${PN} += "cross-x86-64-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-x86-64-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
