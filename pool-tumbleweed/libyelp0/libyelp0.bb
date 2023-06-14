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

RPROVIDES:${PN} += "libyelp.so.0 \
libyelp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libexslt.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblzma.so.5 \
libsqlite3.so.0 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
