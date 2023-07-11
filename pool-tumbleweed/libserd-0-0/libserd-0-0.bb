SUMMARY = "A lightweight C library for RDF syntax"
DESCRIPTION = "A lightweight C library for RDF syntax which supports reading and writing Turtle and NTriples."
LICENSE = "ISC"

PV = "0.30.16"

RPM_NAME = "libserd-0-0-0.30.16-1.2.aarch64.rpm"
RPM_HASH = "37d8a2478c8f7d07078a7afa4ef3adf42874285fc222b7e4c8c65f55fabb54dd9b34ee8658bdef06c6abde12942899d1ecf7318e91fd403f29523272f743c084"

RPROVIDES:${PN} += "libserd-0-0 \
libserd-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
