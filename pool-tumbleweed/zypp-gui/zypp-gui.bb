SUMMARY = "Update the system, search, install and remove the package, configure the repos."
DESCRIPTION = "Application can update the system, search, install and remove the package, configure the repos. It achieves some functions of command zypper."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "zypp-gui-0.2.0-1.1.aarch64.rpm"
RPM_HASH = "b56d969941d812ba87f860404b32947be227369fa3f3da98cfb5d2b7e7709d8c41095f61be6f6a4a390a42b4686f31a21e2f978bf377863e2d57d44fac654a8b"

RPROVIDES:${PN} += "zypp-gui"

RDEPENDS:${PN} += "PackageKit \
libadwaita-1.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpackagekit-glib2.so.18 \
libpango-1.0.so.0 \
pkexec"

inherit rpm
