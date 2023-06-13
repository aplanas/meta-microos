SUMMARY = "C++ Binding for the ATK library"
DESCRIPTION = "atkmm is the C++ binding for the ATK library. \
This module is part of the GNOME C++ bindings effort."
LICENSE = "LGPL-2.1-or-later"

PV = "2.28.3"

RPM_NAME = "libatkmm-1_6-1-2.28.3-1.3.aarch64.rpm"
RPM_HASH = "df650b1255ad929b96bad7dbdb24f7dd09f293cdd6b0f35212b97fccc6e8a13def66e6c90579dcff868acf8f271e6082afe4b18512d6d11552171c34c90eae16"

RPROVIDES:${PN} += "libatkmm-1.6.so.1()(64bit) \
libatkmm-1_6-1 \
libatkmm-1_6-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
