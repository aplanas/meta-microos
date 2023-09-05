SUMMARY = "Qt5 bindings for AppStream"
DESCRIPTION = "The Qt5 bindings for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.3"

RPM_NAME = "libAppStreamQt2-0.16.3-1.1.aarch64.rpm"
RPM_HASH = "f9f4b8ce9e8d06ba87795d3eb14f2f5d86168f8c8e0337580477795b1700ab85f6e24ac884f9a01fae11cb8dc9e384152de131f1e9ff8a7b60ecf7ef9aad5eb2"

RPROVIDES:${PN} += "libAppStreamQt.so.2 \
libAppStreamQt2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libappstream.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
