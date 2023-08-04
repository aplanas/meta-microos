SUMMARY = "3D graphics toolkit"
DESCRIPTION = "Utility library for converting data+materials to/from VulkanSceneGraph."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "vsgXchange-1.0.4-1.1.aarch64.rpm"
RPM_HASH = "5fb2eecfb8837ff9ef5d3fa8b0d1f0bd5ed2e756b33c13c2705521900a437eef55d09e1178499a3b5e23726c28654b6b292937f9ec066ef75f02799f74dcc9d7"

RPROVIDES:${PN} += "vsgXchange"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvsg.so.14 \
libvsgXchange.so.1"

inherit rpm
