SUMMARY = "Introspection bindings for gtk-vnc"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package provides the GObject Introspection bindings for the libgvnc \
library."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "typelib-1_0-GVnc-1_0-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "7c0ff68aea24cad1a1eeb2682dc6f345e058ac37357bbdc8a495dd41afca6110af52bb439a2a21c4a81e3ca8a2a2ad0372901dc3418d467435de46cd65cd11a0"

RPROVIDES:${PN} += "typelib(GVnc) \
typelib-1_0-GVnc-1_0 \
typelib-1_0-GVnc-1_0(aarch-64)"
RDEPENDS:${PN} += "libgvnc-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
