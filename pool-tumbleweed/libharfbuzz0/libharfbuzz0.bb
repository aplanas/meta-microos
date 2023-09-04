SUMMARY = "An OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine."
LICENSE = "MIT"

PV = "8.1.1"

RPM_NAME = "libharfbuzz0-8.1.1-1.1.aarch64.rpm"
RPM_HASH = "2d026c0e258d5001151107017b875fa4463883a61cdde8ba9b6a22ea7620b95bf503a8c3f64204d3bbeac40f951663b3e5ff4cb24ca71646fdc83b2a5ce55921"

RPROVIDES:${PN} += "libharfbuzz.so.0 \
libharfbuzz0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libgraphite2.so.3 \
libm.so.6"

inherit rpm
