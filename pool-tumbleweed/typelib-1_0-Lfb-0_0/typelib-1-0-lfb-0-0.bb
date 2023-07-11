SUMMARY = "Introspection bindings for feedbackd"
DESCRIPTION = "feedbackd provides a DBus daemon (feedbackd) to act on events to provide \
haptic, visual and audio feedback. It offers a library (libfeedback) and \
GObject introspection bindings to ease using it from applications. \
 \
This package contains the introspection bindings for feedbackd."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.1.0"

RPM_NAME = "typelib-1_0-Lfb-0_0-0.1.0-2.3.aarch64.rpm"
RPM_HASH = "b0a0090a73faee7b2e310c51abab4a918bf01118335b13ca6d7640a09427781c81c8ce2dce266a3f184af0894bb110a1e132be2aa6e0a4d6c871a03cd8fd372d"

RPROVIDES:${PN} += "typelib-1-0-Lfb-0-0 \
typelib-Lfb"

RDEPENDS:${PN} += "libfeedback-0.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
