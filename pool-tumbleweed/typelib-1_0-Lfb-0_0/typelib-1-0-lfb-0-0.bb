SUMMARY = "Introspection bindings for feedbackd"
DESCRIPTION = "feedbackd provides a DBus daemon (feedbackd) to act on events to provide \
haptic, visual and audio feedback. It offers a library (libfeedback) and \
GObject introspection bindings to ease using it from applications. \
 \
This package contains the introspection bindings for feedbackd."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.2.1"

RPM_NAME = "typelib-1_0-Lfb-0_0-0.2.1-1.1.aarch64.rpm"
RPM_HASH = "25e213b9f2a96c85effc348a20a26853f312a2f902216fdadafa7c54a871a70deab499f664996b7b0bdb37a06b585c41ca40d2729ed5de0a76077f67facb89fa"

RPROVIDES:${PN} += "typelib-1-0-Lfb-0-0 \
typelib-Lfb"

RDEPENDS:${PN} += "libfeedback-0.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
