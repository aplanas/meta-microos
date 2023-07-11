SUMMARY = "The glib binding library for urfkill"
DESCRIPTION = "Urfkill add-on library to integrate the standard urfkill library with \
the GLib thread abstraction and main loop."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "liburfkill-glib0-0.5.0-3.7.aarch64.rpm"
RPM_HASH = "f6c78b0e93cc79051d1aef62c0e8536a10044812c9e386513f051911c862665daa9aea6369001916c95ac25a29b0e9212f5f25724166d08f5f4d07b934005039"

RPROVIDES:${PN} += "liburfkill-glib.so.0 \
liburfkill-glib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
