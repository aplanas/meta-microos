SUMMARY = "GObject-based library for the Telepathy D-Bus API -- Introspection bindings"
DESCRIPTION = "The telepathy-glib library is a GObject-based C binding for the \
Telepathy D-Bus API. \
 \
This package provides the GObject Introspection bindings for the \
telepathy-glib library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.2"

RPM_NAME = "typelib-1_0-TelepathyGlib-0_12-0.24.2-1.11.aarch64.rpm"
RPM_HASH = "97004427e75fe904ccc4cad4e07149b531a53cbaccd9a6042be582d3d4e7886383693ba5d2d4da381b44f4b3fac21718393cd30a75a587878ab3a51ea912b95e"

RPROVIDES:${PN} += "typelib-1-0-TelepathyGlib-0-12 \
typelib-TelepathyGLib"

RDEPENDS:${PN} += "libtelepathy-glib.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
