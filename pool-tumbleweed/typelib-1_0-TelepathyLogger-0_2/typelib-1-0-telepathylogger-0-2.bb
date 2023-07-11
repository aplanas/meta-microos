SUMMARY = "Introspection bindings for the Telepathy Framework Centralized Logging"
DESCRIPTION = "tp-logger is a headless Observer client that logs information received by the \
Telepathy framework. It features pluggable backends to log different sorts of \
messages, in different formats. \
 \
tp-logger features a Telepathy-style D-Bus API to expose logs and interesting \
information related to logging (most frequent contacts, etc.). It also provides \
a GLib-compatible client API for making bulk log requests (e.g. for display \
logs in applications without having to provide lots of information over D-Bus). \
 \
This package provides the GObject Introspection bindings for Telepathy Logger."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "typelib-1_0-TelepathyLogger-0_2-0.8.2-7.10.aarch64.rpm"
RPM_HASH = "cda34aa75209331c63804875f80e85851e029ff0ffbd33a737d2660f2bd4fbff1c832755b7a316bdfe80ea4972938238fc1bdbb9e265ad3387942c66a7a7845b"

RPROVIDES:${PN} += "typelib-1-0-TelepathyLogger-0-2 \
typelib-TelepathyLogger"

RDEPENDS:${PN} += "libtelepathy-logger.so.3 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-TelepathyGLib"

inherit rpm
