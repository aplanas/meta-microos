SUMMARY = "GZip compatible compression utlity"
DESCRIPTION = "Example program for libzopfli to create gzip compatible files. Files can be \
decompressed with e.g. gzip."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "zopfli-1.0.3-2.1.aarch64.rpm"
RPM_HASH = "15efef32ed16541d2ff201175ae970c07cca54270f9a887475a305f0e6d2216d84d6a8ec9b407a77d183c3d0a4974998623ca0387b020af406455d3938f08d7a"

RPROVIDES:${PN} += "zopfli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzopfli.so.1 \
libzopflipng.so.1"

inherit rpm
