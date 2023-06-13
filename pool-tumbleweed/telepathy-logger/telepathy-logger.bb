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

RPM_NAME = "telepathy-logger-0.8.2-7.9.aarch64.rpm"
RPM_HASH = "75d82f7fe0f6f3b842f5a302aceafe444811523d92808865868a8bbaadb390819207d20021c89160fee411f6d1b90c35fff20151ff05b18fdf32ca18c5f2ddf6"

RPROVIDES:${PN} += "telepathy-logger \
telepathy-logger(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libtelepathy-glib.so.0()(64bit) \
libtelepathy-logger.so.3()(64bit)"

inherit rpm
