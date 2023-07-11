SUMMARY = "Libraries for appstream compose support"
DESCRIPTION = "The library for AppStream compose support."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.2"

RPM_NAME = "libappstream-compose0-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "5db89aa3f59bf2e04569b7cfad97e5a671a897349700a724b4de9a51c9f157ff976046d398ec5297f3cd85776f9e0015dca4eb8638a1fa0fb1502ba7c4c48f10"

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
