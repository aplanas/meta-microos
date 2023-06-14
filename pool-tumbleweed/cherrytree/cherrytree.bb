SUMMARY = "A hierarchical note taking application"
DESCRIPTION = "A hierarchical note taking application, featuring rich text and syntax \
highlighting, storing all the data (including images) in a single xml \
file with extension '.ctd'."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only"

PV = "0.99.55"

RPM_NAME = "cherrytree-0.99.55-1.3.aarch64.rpm"
RPM_HASH = "e9ee34b62f0c2214100e4685e49d1650cfc16da66c697d6c07d9ed88db7f454e6d2da5a2de74f9a2b9ab990e049c68fa9690847556f15673eb2489163acb8d4f"

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
