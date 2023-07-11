SUMMARY = "Library for parsing the Apple Keynote presentations"
DESCRIPTION = "Libetonyek is library providing ability to interpret and import Apple Keynote \
presentations into various applications."
LICENSE = "MPL-2.0"

PV = "0.1.10"

RPM_NAME = "libetonyek-0_1-1-0.1.10-1.12.aarch64.rpm"
RPM_HASH = "06be01f49b894eeeb5eb493a0396699dbee3a290cc9e36203e490b544601a9b182affc3d9e5df8b1a5aa3e22fc9fa71cc6c3c6b86a5819fc72fc0a1039925eb4"

RPROVIDES:${PN} += "libetonyek-0-1-1 \
libetonyek-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblangtag.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
