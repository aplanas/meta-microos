SUMMARY = "The main library for AppStream"
DESCRIPTION = "The main library for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "libappstream4-0.16.1-3.1.aarch64.rpm"
RPM_HASH = "00dc907215e930bf2b8c8b2d38896311661c82bd48f3dceeae76933c5ebfba1d304d2763fbd9340bfd3746de4ebff94123033aacde024b3e69a900d302f0f51d"

RPROVIDES:${PN} += "libappstream.so.4 \
libappstream4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0 \
libxml2.so.2 \
libxmlb.so.2 \
libyaml-0.so.2"

inherit rpm
