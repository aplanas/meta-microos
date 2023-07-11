SUMMARY = "Feedback library for GNOME"
DESCRIPTION = "feedbackd provides a DBus daemon (feedbackd) to act on events to provide \
haptic, visual and audio feedback. It offers a library (libfeedback) and \
GObject introspection bindings to ease using it from applications."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.1.0"

RPM_NAME = "feedbackd-0.1.0-2.3.aarch64.rpm"
RPM_HASH = "6d8b82c048ad05a92d772c553d36f8639a31404f113c8253156f87ab315cf9cbedc5b852be563c86fe25e805ba4a87c50f649a13125a98d99b941730d23c79b1"

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
