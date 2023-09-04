SUMMARY = "Implementation of the UPnP specification - Development Files"
DESCRIPTION = "GUPnP implements the UPnP specification: resource announcement and \
discovery, description, control, event notification, and presentation \
(GUPnP includes basic web server functionality through libsoup). GUPnP \
does not include helpers for construction or control of specific \
standardized resources (e.g. MediaServer); this is left for higher level \
libraries utilizing the GUPnP framework."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.5"

RPM_NAME = "libgupnp-devel-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "f7ffe09bb0dead3b45a58f539615ce6d6c14973efb5b4faac952f1a0e42f6962dfd876a04cc7960e261b93f3a569a90a965dc13290542902a50c1b68d527fc91"

RPROVIDES:${PN} += "libgupnp-devel \
pkgconfig-gupnp-1.6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
libgupnp-1-6-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gssdp-1.6 \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-GUPnP-1-0"

inherit rpm
