SUMMARY = "Gnome Devtool Libraries"
DESCRIPTION = "Gnome Devtool Libraries contains components and libraries that are \
intended to be shared between GNOME development tools, including \
gnome-debug, gnome-build, and anjuta2."
LICENSE = "LGPL-2.1-or-later"

PV = "3.40.0"

RPM_NAME = "libgdl-3-5-3.40.0-2.10.aarch64.rpm"
RPM_HASH = "323ddced457a46e9a4950812b6aa596fbc75c6a12b0498f53d799cedcc89da81be5b00fe70eb084d663d60e9f975448e0204a4cbf2f5c9fbd9d14a828845762f"

RPROVIDES:${PN} += "gdl \
libgdl-3-5 \
libgdl-3.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxml2.so.2"

inherit rpm
