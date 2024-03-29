SUMMARY = "A library for serialising LV2 atoms to/from RDF"
DESCRIPTION = "A library for serialising LV2 atoms to/from RDF, particularly the Turtle syntax."
LICENSE = "ISC"

PV = "0.6.14"

RPM_NAME = "libsratom-0-0-0.6.14-1.1.aarch64.rpm"
RPM_HASH = "b7b46996e2f338e5b6cccbc9f6ce1c1e89b26c79ecc84bff70b39c0d1fdca63f02eb61a67acc5d113f15265aa1434e3ec95b462b255e5c928e4ed084849ba78d"

RPROVIDES:${PN} += "libsratom-0-0 \
libsratom-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libserd-0.so.0 \
libsord-0.so.0"

inherit rpm
