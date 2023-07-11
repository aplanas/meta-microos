SUMMARY = "Pre Mac OSX text file formats parser library"
DESCRIPTION = "Libmwaw is a new project for converting many pre-OSX MAC text formats."
LICENSE = "GPL-2.0-or-later & (LGPL-2.1-or-later | MPL-2.0)"

PV = "0.3.21"

RPM_NAME = "libmwaw-0_3-3-0.3.21-2.10.aarch64.rpm"
RPM_HASH = "151ee1df3406c6f96c925fb7dc8ebcd7d5378f5421db8fca48a8f8c5c60a21185eddd4f18ab82d3d3294394ada6d953fbb2ccb42ebdc6a1b5751e175d1a3357c"

RPROVIDES:${PN} += "libmwaw-0-3-3 \
libmwaw-0.3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
