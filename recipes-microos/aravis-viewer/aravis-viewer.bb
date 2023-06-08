SUMMARY = "Glib/gobject based library implementing a Genicam interface"
DESCRIPTION = "This package contains arv-viewer, GUI application for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.26"

RPM_NAME = "aravis-viewer-0.8.26-1.1.aarch64.rpm"
RPM_HASH = "8b9b61044f6081726c0690d9c482b31a9c8710a5bbd8e9db9b022cca4ed987d33114d4a503eef8c1a1058ac593e5aec6107f1cae9265c3cd1b82f1b5e71832c1"

RPROVIDES:${PN} += "application() application(arv-viewer-0.8.desktop) aravis-viewer aravis-viewer(aarch-64) metainfo() metainfo(arv-viewer-0.8.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaravis-0.8.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstapp-1.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
