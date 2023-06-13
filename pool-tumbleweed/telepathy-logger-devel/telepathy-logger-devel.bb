SUMMARY = "Development files for the Telepathy Framework Centralized Logging"
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

RPM_NAME = "telepathy-logger-devel-0.8.2-7.9.aarch64.rpm"
RPM_HASH = "a78fa30b590e7da368378d12c73b4c084bbe20ca9d748e08b1a096db9280314cdb67c20a1fbafbb0c1ad2c10b109443e0780caf4556ad743de78d5e8ebae4b78"

RPROVIDES:${PN} += "pkgconfig(telepathy-logger-0.2) \
pkgconfig(tpl-extensions) \
telepathy-logger-devel \
telepathy-logger-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtelepathy-logger3 \
libtpl-extensions3 \
pkgconfig(libxml-2.0) \
pkgconfig(telepathy-glib) \
typelib-1_0-TelepathyLogger-0_2"

inherit rpm
