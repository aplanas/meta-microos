SUMMARY = "Shared library for feedbackd"
DESCRIPTION = "feedbackd provides a DBus daemon (feedbackd) to act on events to provide \
haptic, visual and audio feedback. It offers a library (libfeedback) and \
GObject introspection bindings to ease using it from applications. \
 \
This package contains the shared library for feedbackd."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.1.0"

RPM_NAME = "libfeedback-0_0-0-0.1.0-2.3.aarch64.rpm"
RPM_HASH = "3c61620cc217745c9227b08fe67cefb8eeceb804d481437575811eca5a975775bea746dedd44e35e7e5f7e34a8a8c9446a97418ae73dfece3ecb9b1908cb2468"

RPROVIDES:${PN} += "libfeedback-0-0-0 \
libfeedback-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
