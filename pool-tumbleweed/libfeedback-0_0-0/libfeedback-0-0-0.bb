SUMMARY = "Shared library for feedbackd"
DESCRIPTION = "feedbackd provides a DBus daemon (feedbackd) to act on events to provide \
haptic, visual and audio feedback. It offers a library (libfeedback) and \
GObject introspection bindings to ease using it from applications. \
 \
This package contains the shared library for feedbackd."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.1.0"

RPM_NAME = "libfeedback-0_0-0-0.1.0-2.2.aarch64.rpm"
RPM_HASH = "978cdabe175016b99f06d4cfa407c1f4e9911ad7b2522aeb8791aaafbe165d793df0c2ce34c8739a243b01e1eb1d325fada4f21f493dc6e8fac9a26e06c35cfa"

RPROVIDES:${PN} += "libfeedback-0-0-0 \
libfeedback-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
