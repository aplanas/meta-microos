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

RPM_NAME = "telepathy-logger-devel-0.8.2-7.10.aarch64.rpm"
RPM_HASH = "9887a3b560e6e41d7a9a40d82129a7494ded976586185d102b98f2a1927c1ecc2f0a1451bc60674c592fcbb0602b11ada655da50b15ff0b8319bbe0cfdd812ee"

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
