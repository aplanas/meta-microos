SUMMARY = "GZip compatible compression utlity"
DESCRIPTION = "Example program for libzopfli to create gzip compatible files. Files can be \
decompressed with e.g. gzip."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "zopfli-1.0.3-2.2.aarch64.rpm"
RPM_HASH = "5c53c6bb8310156fe055a5396dc498c8e49e1be7f83eeea6f3c73e4b9c7a11043a856e3fd25f79288df68e275f97b9c09cdd8854587ebe63fac571f4df4bf8b9"

RPROVIDES:${PN} += "zopfli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzopfli.so.1 \
libzopflipng.so.1"

inherit rpm
