SUMMARY = "Centralized Logging for the Telepathy Framework"
DESCRIPTION = "tp-logger is a headless Observer client that logs information received by the \
Telepathy framework. It features pluggable backends to log different sorts of \
messages, in different formats. \
 \
tp-logger features a Telepathy-style D-Bus API to expose logs and interesting \
information related to logging (most frequent contacts, etc.). It also provides \
a GLib-compatible client API for making bulk log requests (e.g. for display \
logs in applications without having to provide lots of information over D-Bus)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "libtelepathy-logger3-0.8.2-7.10.aarch64.rpm"
RPM_HASH = "832999f04cb7dca5d4ead0c071555fcbda376cbaf8c081e930784eb81a20771a38e0bd4305c7b299aa76f79d2d26b3181f736bc8ad0f26ab1bd65f678e7ba391"

RPROVIDES:${PN} += "libtelepathy-logger.so.3 \
libtelepathy-logger3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsqlite3.so.0 \
libtelepathy-glib.so.0 \
libxml2.so.2"

inherit rpm
