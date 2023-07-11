SUMMARY = "FOX interface for Gwenhywfar"
DESCRIPTION = "This package contains the interface to the FOX toolkit \
for Gwenhywfar."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "libgwengui-fox16-79-5.10.1-1.5.aarch64.rpm"
RPM_HASH = "6c85b35404d637c9d475cd41282ad90075514c243a614711000c5079ebdfbf81b0ab9f4393014471d0c14f45c4c8269a592d87852f8d116b618a68f04789d889"

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
