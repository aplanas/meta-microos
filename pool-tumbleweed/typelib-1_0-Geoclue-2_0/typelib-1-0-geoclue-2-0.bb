SUMMARY = "GeoLocation Framework --GObject Introspection"
DESCRIPTION = "GeoClue is a software framework which can be used to enable geospatial \
awareness in applications. GeoClue uses the D-Bus inter-process \
communication mechanism to provide location information"
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "typelib-1_0-Geoclue-2_0-2.7.0-1.3.aarch64.rpm"
RPM_HASH = "431aaccf0df4500f8c0f3d97b79cb1cc0cd75c16ea873b86b28d77de90ab01784a2f462ad59fa9562086e09e14869dd411f4e6ff45c1bd11ca40562997a2518d"

RPROVIDES:${PN} += "typelib(Geoclue) \
typelib-1_0-Geoclue-2_0 \
typelib-1_0-Geoclue-2_0(aarch-64)"
RDEPENDS:${PN} += "libgeoclue-2.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
