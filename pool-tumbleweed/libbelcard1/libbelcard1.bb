SUMMARY = "C++ library to manipulate vCard standard format files"
DESCRIPTION = "Belcard is a C++ library to manipulate the vCard standard format files."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.16"

RPM_NAME = "libbelcard1-5.2.16-1.4.aarch64.rpm"
RPM_HASH = "dcb214108fb90f8b1c2292d1063443fea0d89c92467e69575065d9ca077847132835355f4c67010edfa0806cec82fd9b7ed26ffc6548584059f57746c1e8a9ec"

RPROVIDES:${PN} += "libbelcard.so.1 \
libbelcard1"

RDEPENDS:${PN} += "/sbin/ldconfig \
belcard-data \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libbelr.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
