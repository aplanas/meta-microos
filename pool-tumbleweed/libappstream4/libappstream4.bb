SUMMARY = "The main library for AppStream"
DESCRIPTION = "The main library for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "libappstream4-0.16.1-3.1.aarch64.rpm"
RPM_HASH = "00dc907215e930bf2b8c8b2d38896311661c82bd48f3dceeae76933c5ebfba1d304d2763fbd9340bfd3746de4ebff94123033aacde024b3e69a900d302f0f51d"

RPROVIDES:${PN} += "libappstream.so.4()(64bit) \
libappstream4 \
libappstream4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcurl.so.4()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_240)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.23)(64bit) \
libxml2.so.2(LIBXML2_2.6.8)(64bit) \
libxml2.so.2(LIBXML2_2.9.0)(64bit) \
libxmlb.so.2()(64bit) \
libxmlb.so.2(LIBXMLB_0.1.0)(64bit) \
libxmlb.so.2(LIBXMLB_0.1.1)(64bit) \
libxmlb.so.2(LIBXMLB_0.1.12)(64bit) \
libxmlb.so.2(LIBXMLB_0.1.4)(64bit) \
libxmlb.so.2(LIBXMLB_0.3.0)(64bit) \
libxmlb.so.2(LIBXMLB_0.3.1)(64bit) \
libxmlb.so.2(LIBXMLB_0.3.4)(64bit) \
libyaml-0.so.2()(64bit)"

inherit rpm
