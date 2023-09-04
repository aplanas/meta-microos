SUMMARY = "A library for decoding various ACARS message payloads"
DESCRIPTION = "libacars is a library for decoding various ACARS message payloads."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "libacars-2-2-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "83fad930666077bf25e0b68ba6122b91e3a7306bf351543a3c009e911368223599c048a022e63ccf4f23f556b9c0445bb1f5f12d422a0f091a382873baa3c3a2"

RPROVIDES:${PN} += "libacars-2-2 \
libacars-2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
libxml2.so.2 \
libz.so.1"

inherit rpm
