SUMMARY = "C++ interface for Pango"
DESCRIPTION = "pangomm provides a C++ interface to the pango library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.50.1"

RPM_NAME = "libpangomm-2_48-1-2.50.1-1.3.aarch64.rpm"
RPM_HASH = "bcf410cc2ea348d54bb9fa1e9b1b2220cf361d25c211781845e066d14bcd4a40f3785c13698fc270990e86ba23d8a6ec6114e5af51fb695202f8cab46c39432d"

RPROVIDES:${PN} += "libpangomm-2-48-1 \
libpangomm-2.48.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairomm-1.16.so.1 \
libgcc-s.so.1 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
