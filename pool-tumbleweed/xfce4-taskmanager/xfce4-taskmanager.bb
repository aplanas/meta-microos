SUMMARY = "Simple Taskmanager for the Xfce Desktop Environment"
DESCRIPTION = "xfce4-taskmanager is a simple taskmanager for the Xfce desktop environment. It \
can display window and icon names in a tree view, columns can be reordered, and \
CPU and memory usage are displayed as a graph."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.5"

RPM_NAME = "xfce4-taskmanager-1.5.5-1.4.aarch64.rpm"
RPM_HASH = "6accf9096bdc23cb60e5c66e49f5721c20521eb2fd3076a1d47402461877cf0a06b01b1ad615536d61585ae2ea79eb986d580a9d15bfa08fdc3df8d925bbcf2a"

RPROVIDES:${PN} += "xfce4-taskmanager"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmu.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwnck-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
