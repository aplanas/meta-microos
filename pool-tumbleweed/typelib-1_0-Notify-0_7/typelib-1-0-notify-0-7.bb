SUMMARY = "Notifications Library -- Introspection bindings"
DESCRIPTION = "D-BUS notifications library. \
 \
This package provides the GObject Introspection bindings for libnotify."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "typelib-1_0-Notify-0_7-0.8.2-1.4.aarch64.rpm"
RPM_HASH = "e1e8628609a03783b91410acc98e6cbecd0c11b204ceb39bc7669e9f009cfbc07f24a0d07b9f512c069eac31a070da94c91ed63d9018ac672d8c29f0143d934e"

RPROVIDES:${PN} += "typelib-1-0-Notify-0-7 \
typelib-Notify"

RDEPENDS:${PN} += "libnotify.so.4 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio"

inherit rpm
