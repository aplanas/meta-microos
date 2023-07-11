SUMMARY = "Client library for interacting with the Zeitgeist daemon -- Development Files"
DESCRIPTION = "Libzeitgeist is a client library for interacting with the Zeitgeist \
daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.18"

RPM_NAME = "libzeitgeist-devel-0.3.18-12.4.aarch64.rpm"
RPM_HASH = "0a8f993fb87839e1e134566f6aeafd106fe91fb6c19909fdb23c384012cbdb909fd3b3a20a6da7b67af97d105e7c30a7ea90f22accdd466427174a952288be7a"

RPROVIDES:${PN} += "libzeitgeist-devel \
pkgconfig-zeitgeist-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzeitgeist-1-0-1 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
