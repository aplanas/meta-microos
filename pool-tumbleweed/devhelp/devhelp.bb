SUMMARY = "Developer's Help Program for GNOME"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "devhelp-43.0-2.1.aarch64.rpm"
RPM_HASH = "31132acaeba5e8a8ac2c0a23a55817a8d4f4b9d17cd94f252cd1bba967f7b5d9064c2a4115e9031f1a9634ec7d907d0dc8ee9389e413f7e964b29705397fee54"

RPROVIDES:${PN} += "application() \
application(org.gnome.Devhelp.desktop) \
devhelp \
devhelp(aarch-64) \
libdevhelp-3.so.6()(64bit) \
metainfo() \
metainfo(org.gnome.Devhelp.appdata.xml)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit) \
libwebkit2gtk-4.1.so.0()(64bit)"

inherit rpm
