SUMMARY = "Account management library for GLib Applications"
DESCRIPTION = "This package contains the shared libraries for use by applications."
LICENSE = "LGPL-2.1-only"

PV = "1.26"

RPM_NAME = "libaccounts-glib0-1.26-1.3.aarch64.rpm"
RPM_HASH = "caa4424ddab519854055a39000ba0f2b02b7427244d4b2407f1495d04838830dc1d5e772023725f0db8c4abad0638e6cbf50a641cde2873bbab1d2eb609fe657"

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
