SUMMARY = "An ZMF generator library"
DESCRIPTION = "libzmf is a library for generating Zoner documents. It is directly \
pluggable into import filters based on librevenge."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libzmf-0_0-0-0.0.2-1.44.aarch64.rpm"
RPM_HASH = "65fea849bc084606dab1e0440d1ec4beaee329582ee7127a08f30a68279908e71581a03bd1aa56321ba050804afde90059f38632d6332aeb5f4d3ca5e0f38ac1"

RPROVIDES:${PN} += "libzmf-0-0-0 \
libzmf-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.73 \
libm.so.6 \
libpng16.so.16 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
