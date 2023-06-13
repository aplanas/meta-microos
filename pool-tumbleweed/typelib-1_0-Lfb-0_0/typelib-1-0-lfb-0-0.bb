SUMMARY = "Introspection bindings for feedbackd"
DESCRIPTION = "feedbackd provides a DBus daemon (feedbackd) to act on events to provide \
haptic, visual and audio feedback. It offers a library (libfeedback) and \
GObject introspection bindings to ease using it from applications. \
 \
This package contains the introspection bindings for feedbackd."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.1.0"

RPM_NAME = "typelib-1_0-Lfb-0_0-0.1.0-2.2.aarch64.rpm"
RPM_HASH = "6d93ce9df0e56fd36405a183acb0b2bf58a741f0fc4e5564cc2a2a8302a4d2cf6c8ae2527248dd06a145cb7a5d088f6a040e25045caf038c336035a38d98b26f"

RPROVIDES:${PN} += "typelib(Lfb) \
typelib-1_0-Lfb-0_0 \
typelib-1_0-Lfb-0_0(aarch-64)"

RDEPENDS:${PN} += "libfeedback-0.0.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
