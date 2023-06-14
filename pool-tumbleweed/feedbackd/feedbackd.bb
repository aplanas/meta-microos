SUMMARY = "Feedback library for GNOME"
DESCRIPTION = "feedbackd provides a DBus daemon (feedbackd) to act on events to provide \
haptic, visual and audio feedback. It offers a library (libfeedback) and \
GObject introspection bindings to ease using it from applications."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.1.0"

RPM_NAME = "feedbackd-0.1.0-2.2.aarch64.rpm"
RPM_HASH = "57a2b6e049905303160f1e766fe146e2314800fa3050e432a0ea05082df59e2fdee1b6a1020f3c3041003b504f2b0889ada15b1757510eca3624f8c056b67607"

RPROVIDES:${PN} += "feedbackd"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfeedback-0.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgudev-1.0.so.0 \
libjson-glib-1.0.so.0"

inherit rpm
