SUMMARY = "A library for decoding various ACARS message payloads"
DESCRIPTION = "libacars is a library for decoding various ACARS message payloads."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "libacars1-1.3.1-1.17.aarch64.rpm"
RPM_HASH = "90c1cd1b1b35b2247b994e37981e227fdf95699cebe0e2c265f79a58e87a4850d8380b9ab654c76d76be7760a2fd2d14c55378cb959dd382f4d82342ba6573d1"

RPROVIDES:${PN} += "libacars.so.1 \
libacars1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
