SUMMARY = "Shared library for feedbackd"
DESCRIPTION = "feedbackd provides a DBus daemon (feedbackd) to act on events to provide \
haptic, visual and audio feedback. It offers a library (libfeedback) and \
GObject introspection bindings to ease using it from applications. \
 \
This package contains the shared library for feedbackd."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.2.1"

RPM_NAME = "libfeedback-0_0-0-0.2.1-1.1.aarch64.rpm"
RPM_HASH = "cb723fe3cd73c415ab0ffd006078f67cc101396bc16dfd50b2685759d153a0025d9b4485a7cfa96c206a2fb5a4a3db162a2b287bb4eb37cb166f338235f2aff4"

RPROVIDES:${PN} += "libfeedback-0-0-0 \
libfeedback-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
