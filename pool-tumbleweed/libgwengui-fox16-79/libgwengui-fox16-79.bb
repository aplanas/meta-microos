SUMMARY = "FOX interface for Gwenhywfar"
DESCRIPTION = "This package contains the interface to the FOX toolkit \
for Gwenhywfar."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "libgwengui-fox16-79-5.10.1-1.4.aarch64.rpm"
RPM_HASH = "445fdc20ac6a5b6fd6dc12350256fa6581f31ec88c37d309231d10ccef84fb83af2f450c63d7085a3ca4a2f8221add6194b99a7176e69b6aeb059825653cdcdd"

RPROVIDES:${PN} += "libgwengui-fox16-79 \
libgwengui-fox16.so.79"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFOX-1.6.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgwengui-cpp.so.79 \
libgwenhywfar.so.79 \
libstdc++.so.6"

inherit rpm
