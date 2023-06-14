SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-ppc64le-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "ada8ae27b3b98335d4196f6138cdf770522a865400053d9f79ba86016ec75d5832b3668667706d9b6f9d11581c642b6bc12817c2e3fd7326e43ff07d7c905533"

RPROVIDES:${PN} += "cross-ppc64le-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/bin/sh \
cross-ppc64le-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
