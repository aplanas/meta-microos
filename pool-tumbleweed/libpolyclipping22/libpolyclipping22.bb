SUMMARY = "Polygon clipping library"
DESCRIPTION = "This library primarily performs the boolean clipping operations - \
intersection, union, difference & xor - on 2D polygons. It also performs \
polygon offsetting. The library handles complex (self-intersecting) polygons, \
polygons with holes and polygons with overlapping co-linear edges. \
Input polygons for clipping can use EvenOdd, NonZero, Positive and Negative \
filling modes. The clipping code is based on the Vatti clipping algorithm, \
and outperforms other clipping libraries."
LICENSE = "BSL-1.0"

PV = "6.4.2"

RPM_NAME = "libpolyclipping22-6.4.2-2.9.aarch64.rpm"
RPM_HASH = "cc7c353e8bc01809fe788714d56b7a134445b50946a0bdb958f8e35e7f93b96807c298d03b68263fd945f9cc2bccedd83cbd8fe557495ce1ef17cfc29ba4f71a"

RPROVIDES:${PN} += "libpolyclipping.so.22 \
libpolyclipping22"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
