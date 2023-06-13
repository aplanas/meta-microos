SUMMARY = "Tools for exo"
DESCRIPTION = "This package provides tools and helpers for exo."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.0"

RPM_NAME = "exo-tools-4.18.0-1.3.aarch64.rpm"
RPM_HASH = "1d42cd43dc305095669cf19c4939ba80b4fb14f3fab37507c09a813e13fd9f4e5ce96fb554b8dd8fb6e23874eae31cac3210a0e91e7e5e0577b6d6e389169047"

RPROVIDES:${PN} += "exo-tools \
exo-tools(aarch-64) \
exo:/usr/bin/exo-desktop-item-edit \
exo:/usr/bin/exo-open \
exo:/usr/bin/exo-preferred-applications"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libexo-2.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit)"

inherit rpm
