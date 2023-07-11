SUMMARY = "3D graphics toolkit"
DESCRIPTION = "Utility library for converting data+materials to/from VulkanSceneGraph."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "vsgXchange-1.0.3-1.1.aarch64.rpm"
RPM_HASH = "97e46a3be74388255af35be92c5028a5af8cd1098f6f09f553a2a01205dae5fc06ed906a1aaed1e692b816181d4afa35294f6bfeb90396c1586ca2b63998003b"

RPROVIDES:${PN} += "vsgXchange"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvsg.so.13 \
libvsgXchange.so.1"

inherit rpm
