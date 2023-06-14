SUMMARY = "A library for parsing Embedded OpenType font files"
DESCRIPTION = "libeot is a library for parsing Embedded OpenType files (Microsoft \
embedded font 'standard') and converting them to other formats."
LICENSE = "MPL-2.0"

PV = "0.01"

RPM_NAME = "libeot0-0.01-1.27.aarch64.rpm"
RPM_HASH = "4768ab7d124092d5f98a338ad30caf257354c05ec4fd6ada1761cec932581d62f4a29078de3776c366e27cd4b09feca1a67affa6fec2feabbac21bd1857d2d5d"

RPROVIDES:${PN} += "libeot.so.0 \
libeot0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
