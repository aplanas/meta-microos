SUMMARY = "Extensions for the Telepathy Framework Centralized Logging"
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

RPM_NAME = "libtpl-extensions3-0.8.2-7.9.aarch64.rpm"
RPM_HASH = "1baafe82886de696a631fc3a2996aa679ec388f4b3e6d3e38af7151d7d47b2a8f16a4b1b98065c85d078758119b91bdea1f9dcbd2ec794bc4870d718ac2d2e88"

RPROVIDES:${PN} += "libtpl-extensions.so.3()(64bit) \
libtpl-extensions3 \
libtpl-extensions3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libtelepathy-glib.so.0()(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.1)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.6)(64bit)"

inherit rpm
