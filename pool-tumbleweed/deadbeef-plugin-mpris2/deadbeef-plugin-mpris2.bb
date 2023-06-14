SUMMARY = "MPRISv2 plugin for the DeaDBeeF music player"
DESCRIPTION = "This plugin aims to implement the MPRISv2 D-Bus interface for \
DeaDBeeF for instance to integrate DeaDBeeF into Sound Menu."
LICENSE = "GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "deadbeef-plugin-mpris2-1.14-2.3.aarch64.rpm"
RPM_HASH = "c3d396e3888f6b6d86a35a848720e5a48bc4b222b26df828d0db3245c189bf4a18959a8ee739db57837ea9dab03d6c260ef255c8d0d8bda8e6f80b88e8466b31"

RPROVIDES:${PN} += "deadbeef-MPRIS-plugin \
deadbeef-mpris2-plugin \
deadbeef-plugin-mpris2"

RDEPENDS:${PN} += "deadbeef \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
