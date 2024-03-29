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

RPM_NAME = "telepathy-logger-0.8.2-8.1.aarch64.rpm"
RPM_HASH = "13fbb897bf707849ff134e53e004d4fc5745352610b5af290b1ebbee46f6a9e28c57a89ac692e679c0754b0ef7a687b81a61ac207c1d0a321c0feaa44964f8c7"

RPROVIDES:${PN} += "telepathy-logger"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtelepathy-glib.so.0 \
libtelepathy-logger.so.3"

inherit rpm
