SUMMARY = "Implementation of the UPnP specification - Development Files"
DESCRIPTION = "GUPnP implements the UPnP specification: resource announcement and \
discovery, description, control, event notification, and presentation \
(GUPnP includes basic web server functionality through libsoup). GUPnP \
does not include helpers for construction or control of specific \
standardized resources (e.g. MediaServer); this is left for higher level \
libraries utilizing the GUPnP framework."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.4"

RPM_NAME = "libgupnp-devel-1.6.4-1.1.aarch64.rpm"
RPM_HASH = "b059271c07a630de71698ab41cf06334d22d6ecf28f52131f8a05ad85ed56614f6a2218b33215695d64244cac1718ca2ad725bd801bc8c396649d03b17395102"

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
