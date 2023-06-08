SUMMARY = "Graphical editor for the dconf key-based configuration system"
DESCRIPTION = "dconf is a low-level configuration system. Its main purpose is to \
provide a backend to GSettings on platforms that don't already \
have configuration storage systems. \
 \
This package provides a graphical editor for the dconf database."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "dconf-editor-43.0-1.3.aarch64.rpm"
RPM_HASH = "3ae1f71e584478a2f1141a530a7aa302acaf2da8641ed1ebb38eead1846e2e4f30ae9a26814bf9a04f29ff1b4beb70c10aa97eadb13ddd58285410a54760d59e"

RPROVIDES:${PN} += "application() application(ca.desrt.dconf-editor.desktop) dconf-editor dconf-editor(aarch-64) metainfo() metainfo(ca.desrt.dconf-editor.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdconf.so.1()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libhandy-1.so.0()(64bit) libhandy-1.so.0(LIBHANDY_1_0)(64bit)"

inherit rpm
