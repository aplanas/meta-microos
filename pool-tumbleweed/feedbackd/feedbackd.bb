SUMMARY = "Feedback library for GNOME"
DESCRIPTION = "feedbackd provides a DBus daemon (feedbackd) to act on events to provide \
haptic, visual and audio feedback. It offers a library (libfeedback) and \
GObject introspection bindings to ease using it from applications."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.1.0"

RPM_NAME = "feedbackd-0.1.0-2.2.aarch64.rpm"
RPM_HASH = "57a2b6e049905303160f1e766fe146e2314800fa3050e432a0ea05082df59e2fdee1b6a1020f3c3041003b504f2b0889ada15b1757510eca3624f8c056b67607"

RPROVIDES:${PN} += "feedbackd \
feedbackd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfeedback-0.0.so.0()(64bit) \
libfeedback-0.0.so.0(LIBFEEDBACK_0_0_0)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsound.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit)"

inherit rpm
