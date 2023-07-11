SUMMARY = "C++ Binding for the ATK library -- Shared Library"
DESCRIPTION = "atkmm is the C++ binding for the ATK library. \
This module is part of the GNOME C++ bindings effort. \
 \
This package provides the ATK library's C++'s bindings shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.36.2"

RPM_NAME = "libatkmm-2_36-1-2.36.2-2.4.aarch64.rpm"
RPM_HASH = "d0e0bacd03ab6faba90034facb99da394e14170b24216645cf7d5a1591f3b2907f5d60deb1d0bdc0c6d692f6db61999548dea508f6d192854a785fd605d11a3a"

RPROVIDES:${PN} += "libatkmm-2-36-1 \
libatkmm-2.36.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
