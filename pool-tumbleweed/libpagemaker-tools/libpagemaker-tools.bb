SUMMARY = "Tools to transform Adobe PageMaker documents into other formats"
DESCRIPTION = "Tools to transform Adobe PageMaker documents into other formats. \
Currently supported: SVG, raw."
LICENSE = "MPL-2.0"

PV = "0.0.4"

RPM_NAME = "libpagemaker-tools-0.0.4-1.30.aarch64.rpm"
RPM_HASH = "e5cdef5fa25fb6bb8a71909fb3f44e65d3010fe39dd81c3bc6dca10e7e36a2fe0354d6129146d3cd1aed4065ccf2eb9a2142e9c9d2bb64250bd87ba16309da03"

RPROVIDES:${PN} += "libpagemaker-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpagemaker-0.0.so.0 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6"

inherit rpm
