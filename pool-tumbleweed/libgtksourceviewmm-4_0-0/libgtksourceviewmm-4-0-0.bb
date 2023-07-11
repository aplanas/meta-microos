SUMMARY = "C++ interface for gtksourceview"
DESCRIPTION = "gtksourceviewmm provides a C++ interface to the gtksourceview library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.91.1"

RPM_NAME = "libgtksourceviewmm-4_0-0-3.91.1-1.17.aarch64.rpm"
RPM_HASH = "d224381c86de3ebf884489cd2c09e31c8ce9837abb2c834cae58b527a58121f0a0a818094bd97085f8236e1b8fdcafc28a64764b99662e0649906fad03619f2c"

RPROVIDES:${PN} += "libgtksourceviewmm-4-0-0 \
libgtksourceviewmm-4.0.so.0"

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
libgtksourceview-4.so.0 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
