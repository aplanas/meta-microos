SUMMARY = "GLib-based Instant Messenger Library"
DESCRIPTION = "libpurple is a library intended to be used by programmers seeking \
to write an IM client that connects to many IM networks. \
 \
This package provides the core libpurple library."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple0-2.14.12-1.3.aarch64.rpm"
RPM_HASH = "799018b7ba0b1d26b8aba2ed580cb04bdd4b42eec850db3b405f0ca47610a52702bffa51fd71541122cd556aff9b42044cf7233eb62d7391ca3f72e98a0d4625"

RPROVIDES:${PN} += "libpurple.so.0()(64bit) \
libpurple0 \
libpurple0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libfarstream-0.2.so.5()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libidn.so.12()(64bit) \
libidn.so.12(LIBIDN_1.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
