SUMMARY = "Property displayer for X"
DESCRIPTION = "xprop displays window and font properties of an X server."
LICENSE = "MIT"

PV = "1.2.6"

RPM_NAME = "xprop-1.2.6-1.2.aarch64.rpm"
RPM_HASH = "af6b840c74f5ff7701c1d97785a1e35c538a629cf1e312aae5e0e23c2257d67e44ce19bd11b6c6f2bcedec0afccb239fb3c587850620f6def9eee8edb43c19a4"

RPROVIDES:${PN} += "xprop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
