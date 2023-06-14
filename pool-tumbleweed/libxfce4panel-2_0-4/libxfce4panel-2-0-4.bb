SUMMARY = "Xfce Panel Shared Library"
DESCRIPTION = "This package contains GTK 3 variant of the xfce4-panel shared library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.4"

RPM_NAME = "libxfce4panel-2_0-4-4.18.4-1.1.aarch64.rpm"
RPM_HASH = "b0d583605bad6b5cc92eb693b32b68d91f3f5fccca3bf29052feb09cd65d5cc609ab5bae4366ddd88e506463545d1656087dae2241abf0bcb7af2d2e6880c3ce"

RPROVIDES:${PN} += "libxfce4panel-2-0-4 \
libxfce4panel-2.0.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4util.so.7"

inherit rpm
