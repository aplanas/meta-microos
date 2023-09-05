SUMMARY = "Libraries for appstream compose support"
DESCRIPTION = "The library for AppStream compose support."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.3"

RPM_NAME = "libappstream-compose0-0.16.3-1.1.aarch64.rpm"
RPM_HASH = "f6260a682e6dc69d52e0496fe4a3d83452a902d983aee666a24fed288eb4d4b1dc989d6a700b4328b256075e595db9ccd15e2797213c91ca50fd6b2f9116e870"

RPROVIDES:${PN} += "libappstream-compose.so.0 \
libappstream-compose0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libappstream.so.4 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
librsvg-2.so.2 \
libyaml-0.so.2"

inherit rpm
