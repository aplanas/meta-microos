SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-s390x-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "780408664566bc7897eb68aa34e558a5ae6f56dd690a464e14ceb1932ae6113eb345220c4a860c60d10631e4cd6ec0674ff84e306dfe197143cb63efaf6c7ec5"

RPROVIDES:${PN} += "cross-s390x-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/bin/sh \
cross-s390x-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
