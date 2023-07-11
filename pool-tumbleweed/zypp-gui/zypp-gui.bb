SUMMARY = "Update the system, search, install and remove the package, configure the repos."
DESCRIPTION = "Application can update the system, search, install and remove the package, configure the repos. It achieves some functions of command zypper."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "zypp-gui-0.2.0-1.2.aarch64.rpm"
RPM_HASH = "530992b43181814b1304a3531b95b30642d35e9cac43fef1f79f9a251089e5eae50f127749ff9a0a6eb6a042da08fc2059be2d9d5f4ac7d0f61275fbac43bccf"

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
