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

RPM_NAME = "telepathy-logger-devel-0.8.2-8.1.aarch64.rpm"
RPM_HASH = "72f99e994841a982d378129968d52d892f5e0d85296593a01d049b091ec7ecf6d07a6bbe28a3943d4858d0cf818ac162f84df6d3a624910533b63f26d3fe9002"

RPROVIDES:${PN} += "pkgconfig-telepathy-logger-0.2 \
pkgconfig-tpl-extensions \
telepathy-logger-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtelepathy-logger3 \
libtpl-extensions3 \
pkgconfig-libxml-2.0 \
pkgconfig-telepathy-glib \
typelib-1-0-TelepathyLogger-0-2"

inherit rpm
