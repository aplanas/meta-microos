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

RPM_NAME = "libpolyclipping22-6.4.2-2.8.aarch64.rpm"
RPM_HASH = "7f6c3dc65a91d0d1fe5495d6942e4119d112da3243b435cfc33873c46fa4d73cda22b91d95acbebdf52e33d5c47a8d6a53d30f12a47dcf41c7563ff9fa56a80c"

RPROVIDES:${PN} += "libpolyclipping.so.22()(64bit) \
libpolyclipping22 \
libpolyclipping22(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
