SUMMARY = "Thrift non-blocking server library"
DESCRIPTION = "Shared library providing the non-blocking server component of the \
Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "libthriftnb-0_17_0-0.17.0-1.9.aarch64.rpm"
RPM_HASH = "a0044a40de9129926bce2b521efc64cfc50c7fee08625b286fc35eb0a0a66d81d39adfa47c32434d8331313eabe305c3c64311587404b6e4b02de02b0bb29d27"

RPROVIDES:${PN} += "libthriftnb-0-17-0 \
libthriftnb-0.17.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
