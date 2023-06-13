SUMMARY = "Implementation of the UPnP specification - Development Files"
DESCRIPTION = "GUPnP implements the UPnP specification: resource announcement and \
discovery, description, control, event notification, and presentation \
(GUPnP includes basic web server functionality through libsoup). GUPnP \
does not include helpers for construction or control of specific \
standardized resources (e.g. MediaServer); this is left for higher level \
libraries utilizing the GUPnP framework."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libgupnp-devel-1.6.3-3.1.aarch64.rpm"
RPM_HASH = "336664722eec98dabe326a3e4fc707f669e7f907b745ea940a921e82863f55019f807406ae1aacd6d00dea970615381104b3b7da86db6e66c10993e8094926fe"

RPROVIDES:${PN} += "libgupnp-devel \
libgupnp-devel(aarch-64) \
pkgconfig(gupnp-1.6)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
libgupnp-1_6-0 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gssdp-1.6) \
pkgconfig(libsoup-3.0) \
pkgconfig(libxml-2.0) \
typelib-1_0-GUPnP-1_0"

inherit rpm
