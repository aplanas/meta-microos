SUMMARY = "The core components of R"
DESCRIPTION = "This package provides the core of R, i.e. all that is in base."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-core-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "c0a60f944eed5dbe087e7c9ff15dc7f7f18b692e5c7c398bb2af7a70116518f2df662aaab78dfed1d4f3a1657a4953087b911b0bdf50247b83c772baf06368ea"

RPROVIDES:${PN} += "R-core"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libR.so \
libRlapack.so \
libX11.so.6 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm
