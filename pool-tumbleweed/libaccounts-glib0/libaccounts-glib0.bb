SUMMARY = "Account management library for GLib Applications"
DESCRIPTION = "This package contains the shared libraries for use by applications."
LICENSE = "LGPL-2.1-only"

PV = "1.26"

RPM_NAME = "libaccounts-glib0-1.26-1.4.aarch64.rpm"
RPM_HASH = "cdd24d3a8ec0da38ea5367714058db0957446ed317c5ff3b137a96308112040247525bd5b34f669f303ab2891ad5e8c17fed1770e12c72469bd093b4d6cbb862"

RPROVIDES:${PN} += "libaccounts-glib.so.0 \
libaccounts-glib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsqlite3.so.0 \
libxml2.so.2"

inherit rpm
