SUMMARY = "GTK2 IM Module for UIM"
DESCRIPTION = "Contains GTK+2.0 IM module for uim"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & (BSD-3-Clause | LGPL-2.0-only)"

PV = "1.8.8"

RPM_NAME = "uim-gtk2-1.8.8-9.10.aarch64.rpm"
RPM_HASH = "ecba1d68921dad8800f30368923b1d9dbe89abaaafeea3e7521bea8bf8c8ae7bd65404b385bc598b6051e021a60c1bc4cfa995c360a65311ce5665eb3bc480be"

RPROVIDES:${PN} += "uim-gtk2"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libuim-custom.so.2 \
libuim-scm.so.0 \
libuim.so.8 \
uim"

inherit rpm
