SUMMARY = "Implementation of the UPnP specification -- Introspection bindings"
DESCRIPTION = "GUPnP implements the UPnP specification: resource announcement and \
discovery, description, control, event notification, and presentation \
(GUPnP includes basic web server functionality through libsoup). GUPnP \
does not include helpers for construction or control of specific \
standardized resources (e.g. MediaServer); this is left for higher level \
libraries utilizing the GUPnP framework. \
 \
This package provides the GObject Introspection bindings for GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "typelib-1_0-GUPnP-1_0-1.6.3-3.1.aarch64.rpm"
RPM_HASH = "5617adfe852e75aa7b8dd38d2134d266ef4bc8e66da033f167b99e688250c6e7b557827d1d0371b7e64886761836ffe20236ff08dc368a0d6ac0d3c23a313f2c"

RPROVIDES:${PN} += "typelib(GUPnP) \
typelib-1_0-GUPnP-1_0 \
typelib-1_0-GUPnP-1_0(aarch-64)"

RDEPENDS:${PN} += "libgupnp-1.6.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(GSSDP) \
typelib(Gio) \
typelib(Soup) \
typelib(libxml2)"

inherit rpm
