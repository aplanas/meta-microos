SUMMARY = "Pulse audio bridge for VNC client connections -- Introspection bindings"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package provides the GObject Introspection bindings for the \
libgvncpulse library."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "typelib-1_0-GVncPulse-1_0-1.3.1-1.6.aarch64.rpm"
RPM_HASH = "9ef1252fcc61dd9ce9cae62c89e01f706b94702fe1e2b9127d1db4400fd819418fb9cb77a5cafd0a08399ac248e9764440a57b720e3c81b33fff7aa6dc2906c0"

RPROVIDES:${PN} += "typelib-1-0-GVncPulse-1-0 \
typelib-GVncPulse"

RDEPENDS:${PN} += "libgvncpulse-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-GVnc \
typelib-Gio"

inherit rpm
