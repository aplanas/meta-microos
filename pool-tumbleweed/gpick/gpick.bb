SUMMARY = "Advanced color picker writen in GTK+"
DESCRIPTION = "Gpick is a featured color picker with palette creation and modification \
tools. It is written in C++ and uses GTK+ toolkit for user interface."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "gpick-0.2.5-11.17.aarch64.rpm"
RPM_HASH = "74128f8f7b14b7e3ba36bbb33e5393431a9bacc7b5ccc695c48724a438b9ee878a20e724ac552d13be076b415d0ed102dc80ac246407a66e3f724b9534ef8b76"

RPROVIDES:${PN} += "gpick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libexpat.so.1 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
liblua5.4.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
