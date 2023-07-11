SUMMARY = "A 2D Physics Engine for Games"
DESCRIPTION = "Box2D is an open source C++ engine for simulating rigid bodies in 2D."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "libbox2d2-2.4.1-2.9.aarch64.rpm"
RPM_HASH = "fb20208e2db3cda2683b46ee99d5a792694a3f21e392bd793ee2b8fc31390559f4e0fc6b0c94cea01a8856818de48634eecc01edc983dfb93ece44c70a5f8155"

RPROVIDES:${PN} += "libbox2d.so.2 \
libbox2d2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
