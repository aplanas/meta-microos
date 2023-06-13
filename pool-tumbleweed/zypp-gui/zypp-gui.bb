SUMMARY = "Update the system, search, install and remove the package, configure the repos."
DESCRIPTION = "Application can update the system, search, install and remove the package, configure the repos. It achieves some functions of command zypper."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "zypp-gui-0.2.0-1.1.aarch64.rpm"
RPM_HASH = "b56d969941d812ba87f860404b32947be227369fa3f3da98cfb5d2b7e7709d8c41095f61be6f6a4a390a42b4686f31a21e2f978bf377863e2d57d44fac654a8b"

RPROVIDES:${PN} += "application() \
application(zypp.gui.desktop) \
metainfo() \
metainfo(zypp.gui.metainfo.xml) \
zypp-gui \
zypp-gui(aarch-64)"

RDEPENDS:${PN} += "PackageKit \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libpackagekit-glib2.so.18()(64bit) \
libpango-1.0.so.0()(64bit) \
pkexec"

inherit rpm
