SUMMARY = "A 2D Physics Engine for Games"
DESCRIPTION = "Box2D is an open source C++ engine for simulating rigid bodies in 2D."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "libbox2d-devel-2.4.1-2.9.aarch64.rpm"
RPM_HASH = "1755aefba0fc06b3da11f9e2d473f58ccb4436321c6af67aff5c8310d7f375a3ef2cf6883676cefb85b39e76b0ebae1202b29af310c9fa11b0aa15709bc52385"

RPROVIDES:${PN} += "cmake-box2d \
libbox2d-devel"

RDEPENDS:${PN} += "libbox2d2"

inherit rpm
