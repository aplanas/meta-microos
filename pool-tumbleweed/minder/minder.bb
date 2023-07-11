SUMMARY = "Mind-mapping app"
DESCRIPTION = "A program to create, develop, visualize, organize and manage ideas."
LICENSE = "GPL-3.0-or-later"

PV = "1.14.0"

RPM_NAME = "minder-1.14.0-1.9.aarch64.rpm"
RPM_HASH = "ff6d5d6ff15077f1c65f08aecb562d2259c8c21b57e3841be67a75658f09c66759996b1007eb63927df8b6d1afe5e509facb2d2b1fd96583af5ce16df671f5d7"

RPROVIDES:${PN} += "minder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libhandy-1.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libmarkdown.so.3 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.2"

inherit rpm
