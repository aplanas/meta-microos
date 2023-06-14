SUMMARY = "Advanced color picker writen in GTK+"
DESCRIPTION = "Gpick is a featured color picker with palette creation and modification \
tools. It is written in C++ and uses GTK+ toolkit for user interface."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "gpick-0.2.5-11.16.aarch64.rpm"
RPM_HASH = "3abbf63b745393298ab8bc1c30a7c9b26f9ba2da2891e0477bf3333a74e475357ded4dc5cc80cb6515fafea8c524e3e9c01d0fe2e2c187f479266df90af19a21"

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
