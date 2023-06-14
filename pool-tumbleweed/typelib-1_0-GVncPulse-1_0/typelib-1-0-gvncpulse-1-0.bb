SUMMARY = "Pulse audio bridge for VNC client connections -- Introspection bindings"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package provides the GObject Introspection bindings for the \
libgvncpulse library."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "typelib-1_0-GVncPulse-1_0-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "9484c30bc6025ca1aeac76f7808fdc77adc46cfba2891863961c5e62c471c6b9fdce1254002f281233a168da251a323f09d1a020cd374f0ff7ff6e1abb8b0edd"

RPROVIDES:${PN} += "typelib-1-0-GVncPulse-1-0 \
typelib-GVncPulse"

RDEPENDS:${PN} += "libgvncpulse-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-GVnc \
typelib-Gio"

inherit rpm
