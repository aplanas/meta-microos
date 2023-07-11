SUMMARY = "Window Navigator Construction Kit -- Tools"
DESCRIPTION = "The Window Navigator Construction Kit is a library that can be used to \
write task lists, pagers, and similar GNOME programs. \
 \
This package provides some utilities based on libwnck."
LICENSE = "LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "libwnck-tools-43.0-3.4.aarch64.rpm"
RPM_HASH = "cfa04ae04ef0f5492520a8ad694eef48ada3d764b2094f14e923cecb435a7f36bed4dadd6e161eaf5b9c9ee3eace93fac5245bd9ac5bd95ea844a0f354495907"

RPROVIDES:${PN} += "libwnck-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwnck-3.so.0"

inherit rpm
