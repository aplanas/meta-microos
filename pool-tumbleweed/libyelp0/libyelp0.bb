SUMMARY = "Core library for the GNOME Desktop help browser"
DESCRIPTION = "Yelp is the help viewer in GNOME (it's what happens when you press F1). With \
gnome-doc-utils, Yelp serves as a DocBook viewer, a man page viewer and an \
info page viewer. \
 \
This package provides Yelp's system shared libraries."
LICENSE = "GPL-2.0-or-later"

PV = "42.2"

RPM_NAME = "libyelp0-42.2-1.3.aarch64.rpm"
RPM_HASH = "078ddba6a9db47e9a110448f239856ff309d8642cebbfdb5d187daab15a6c81221356595e6ff44ea1efbbf14a4196ccc54a3cb3789f3470effa00b1c03bf97d9"

RPROVIDES:${PN} += "libyelp.so.0()(64bit) \
libyelp0 \
libyelp0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libexslt.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libsqlite3.so.0()(64bit) \
libwebkit2gtk-4.1.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.3)(64bit) \
libxml2.so.2(LIBXML2_2.7.3)(64bit) \
libxslt.so.1()(64bit) \
libxslt.so.1(LIBXML2_1.0.11)(64bit) \
libxslt.so.1(LIBXML2_1.0.13)(64bit) \
libxslt.so.1(LIBXML2_1.0.18)(64bit) \
libxslt.so.1(LIBXML2_1.0.22)(64bit) \
libxslt.so.1(LIBXML2_1.1.18)(64bit)"

inherit rpm
