SUMMARY = "Window information utility for X"
DESCRIPTION = "xwininfo prints information about windows on an X server."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "xwininfo-1.1.6-1.2.aarch64.rpm"
RPM_HASH = "a2c46048458a34e09b0a3fac64e0038afd64f2eafbec3060ba2f2bc7bf35e283e2a67568ff323a002d378f7f030f7c511596c26e2088ac022c25ea1c18b26de2"

RPROVIDES:${PN} += "xwininfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-shape.so.0 \
libxcb.so.1"

inherit rpm
