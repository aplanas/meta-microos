SUMMARY = "Feedback library for GNOME"
DESCRIPTION = "feedbackd provides a DBus daemon (feedbackd) to act on events to provide \
haptic, visual and audio feedback. It offers a library (libfeedback) and \
GObject introspection bindings to ease using it from applications."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.2.1"

RPM_NAME = "feedbackd-0.2.1-1.1.aarch64.rpm"
RPM_HASH = "d837ebea293cd0791ffa70f583943ad88d0414e11be31e8af2533dfb742a58858f66738d931b1ffb7a9a099b2a0731981c3188d62cb48a93243a599f74c03321"

RPROVIDES:${PN} += "feedbackd"

RDEPENDS:${PN} += "/usr/bin/sh \
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
