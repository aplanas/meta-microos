SUMMARY = "A hierarchical note taking application"
DESCRIPTION = "A hierarchical note taking application, featuring rich text and syntax \
highlighting, storing all the data (including images) in a single xml \
file with extension '.ctd'."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only"

PV = "1.0.1"

RPM_NAME = "cherrytree-1.0.1-1.1.aarch64.rpm"
RPM_HASH = "fbd1a8ca6c5c025b53b7675f3290b3f88763c2872ba6ae8f845363bb1bce40da91bb0dfc4d6d8c3574b178919c2b9a36707d0d7676b1575615e18294c18ab2f4"

RPROVIDES:${PN} += "cherrytree"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairo.so.2 \
libcairomm-1.0.so.1 \
libcurl.so.4 \
libfmt.so.9 \
libfribidi.so.0 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgspell-1.so.2 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libgtksourceviewmm-3.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libuchardet.so.0 \
libvte-2.91.so.0 \
libxml++-2.6.so.2 \
libxml2.so.2"

inherit rpm
