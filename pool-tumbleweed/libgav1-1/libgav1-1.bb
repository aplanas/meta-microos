SUMMARY = "AV1 video decoding library"
DESCRIPTION = "libgav1 is a Main profile (0) & High profile (1) compliant AV1 decoder written \
in C++ and also offering a C API."
LICENSE = "Apache-2.0"

PV = "0.18.0"

RPM_NAME = "libgav1-1-0.18.0-2.2.aarch64.rpm"
RPM_HASH = "e039af36facc4fba5f9b9cba05ca397dd5839aeb707029ab7cfa78f048fce60bbab474024841fd9800fb768e5c48054cf4d03d25cef91927c85adec2148f580e"

RPROVIDES:${PN} += "libgav1-1 \
libgav1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
