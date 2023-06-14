SUMMARY = "C++ interface for gtksourceview"
DESCRIPTION = "gtksourceviewmm provides a C++ interface to the gtksourceview library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.21.3"

RPM_NAME = "libgtksourceviewmm-3_0-0-3.21.3-1.15.aarch64.rpm"
RPM_HASH = "1c728b1cda2f30be04d65714027927c3bc7b6c077977f59bd5ec782ef0eb19f25f3779081122ab837e345bb39ac4702bbced2f78d0a9f9337af4fa38e2ed9467"

RPROVIDES:${PN} += "libgtksourceviewmm-3-0-0 \
libgtksourceviewmm-3.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libgtksourceview-3.0.so.1 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
