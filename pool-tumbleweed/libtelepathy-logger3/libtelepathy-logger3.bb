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

RPM_NAME = "libtelepathy-logger3-0.8.2-8.1.aarch64.rpm"
RPM_HASH = "d7020ddbd2baaa8c57379eb8c80bf63e3ed3c1fd2fcffff4b2187d97adf67a07cbf74263202fd510e3514e86ef1dec1645dc52d74f48aff0e1970a15714fb9bf"

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
libxml2.so.2 \
telepathy-logger-schema"

inherit rpm
