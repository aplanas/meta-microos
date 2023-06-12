SUMMARY = "Simple Taskmanager for the Xfce Desktop Environment"
DESCRIPTION = "xfce4-taskmanager is a simple taskmanager for the Xfce desktop environment. It \
can display window and icon names in a tree view, columns can be reordered, and \
CPU and memory usage are displayed as a graph."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.5"

RPM_NAME = "xfce4-taskmanager-1.5.5-1.3.aarch64.rpm"
RPM_HASH = "cf2975fd63b54ba1af19617e53bb0a0336fa9ef91c92be8b15384b73c11dc88da3dca3f254d43eddf046b9a7a479d11ddb81aea46d126846f1588f4a766ef943"

RPROVIDES:${PN} += "application() \
application(xfce4-taskmanager.desktop) \
xfce4-taskmanager \
xfce4-taskmanager(aarch-64)"
RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXmu.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libwnck-3.so.0()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit)"

inherit rpm
