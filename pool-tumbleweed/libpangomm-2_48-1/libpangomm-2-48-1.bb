SUMMARY = "C++ interface for Pango"
DESCRIPTION = "pangomm provides a C++ interface to the pango library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.50.1"

RPM_NAME = "libpangomm-2_48-1-2.50.1-1.3.aarch64.rpm"
RPM_HASH = "bcf410cc2ea348d54bb9fa1e9b1b2220cf361d25c211781845e066d14bcd4a40f3785c13698fc270990e86ba23d8a6ec6114e5af51fb695202f8cab46c39432d"

RPROVIDES:${PN} += "libpangomm-2.48.so.1()(64bit) \
libpangomm-2_48-1 \
libpangomm-2_48-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairomm-1.16.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgiomm-2.68.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.68.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libsigc-3.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
