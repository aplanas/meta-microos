SUMMARY = "Shared library for LAL Frame"
DESCRIPTION = "This package contains the shared-object libraries needed to run applications \
that use the LAL Frame library."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "liblalframe13-2.0.1-1.2.aarch64.rpm"
RPM_HASH = "a22c9c8eb95704a4a78b1ebc6cd78db09a860ad8a17e4800aa3b06d52ff386e517fff12d5b745af0778995725072eaf898615eefa856ab1ece1abae05c407a25"

RPROVIDES:${PN} += "liblalframe.so.13 \
liblalframe13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframel.so.8 \
liblal.so.20 \
liblalsupport.so.14 \
libm.so.6"

inherit rpm
