SUMMARY = "A 2D Physics Engine for Games"
DESCRIPTION = "Box2D is an open source C++ engine for simulating rigid bodies in 2D."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "libbox2d2-2.4.1-2.8.aarch64.rpm"
RPM_HASH = "acf46e975d87a645941d6a9cc7b421166bca8b4cf74bcedb53686b8a3dce96851a957f9dac360d299e1e18f126d36571ed0a41a4e4d36c21b5c09fda39d8a9d5"

RPROVIDES:${PN} += "libbox2d.so.2 \
libbox2d2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
