SUMMARY = "The core components of R"
DESCRIPTION = "This package provides the core of R, i.e. all that is in base."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-core-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "6fa9f8e7e4c3c0f92d2e3bc20a3d70989dabcffe13029940a20b28a1b00eaf6164a8c70bc80d3dc4a97a8fb7d37053f9eb90d9c1faa06573e69b68657f3b1250"

RPROVIDES:${PN} += "R-core"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
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
