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

RPM_NAME = "typelib-1_0-TelepathyLogger-0_2-0.8.2-8.1.aarch64.rpm"
RPM_HASH = "4299e2672d5b4a7c3c5f0f654cd3781ed752f50b12dc0398522b51ff011b9f5edd3b5a912d84d1f4b188c2aec21b0d9324c8d7eceaa6f5a68efe0565b4ef8c4d"

RPROVIDES:${PN} += "typelib-1-0-TelepathyLogger-0-2 \
typelib-TelepathyLogger"

RDEPENDS:${PN} += "libtelepathy-logger.so.3 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-TelepathyGLib"

inherit rpm
