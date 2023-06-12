SUMMARY = "A lightweight radio player"
DESCRIPTION = "A lightweight radio player written in C and GTK+. It offers a simple way \
to have your favorite radio stations at easy reach."
LICENSE = "GPL-3.0-only"

PV = "0.7.6"

RPM_NAME = "goodvibes-0.7.6-1.3.aarch64.rpm"
RPM_HASH = "2911c6f94f22f0a76561783faa91c07d2d1f8c44c27b80f76c7948cf479d797374ab00fc6c9fbffd246c614ba1f5f8dff95be8d7a6bce15aa04cf0bb995e1c2a"

RPROVIDES:${PN} += "application() \
application(io.gitlab.Goodvibes.desktop) \
goodvibes \
goodvibes(aarch-64) \
metainfo() \
metainfo(io.gitlab.Goodvibes.appdata.xml) \
mimehandler(audio/*)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libkeybinder-3.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit) \
libsoup-2.4.so.1()(64bit)"

inherit rpm
