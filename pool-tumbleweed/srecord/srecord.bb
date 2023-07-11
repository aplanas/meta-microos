SUMMARY = "Hex/bin format conversion package"
DESCRIPTION = "The srecord package is a collection of powerful tools for manipulating EPROM \
load files. It reads and writes numerous EPROM file formats, and can perform \
many different manipulations."
LICENSE = "GPL-3.0+"

PV = "1.64"

RPM_NAME = "srecord-1.64-4.34.aarch64.rpm"
RPM_HASH = "e0ebdda9718484fd23c93af10b9234e7d447d0f61401cea488ded7eb50cecd17250c3ecd802018e7ac6c511fb9ede083e5e15c2a8d763bbd9b20e2e30e1e097b"

RPROVIDES:${PN} += "srecord"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsrecord.so.0 \
libstdc++.so.6"

inherit rpm
