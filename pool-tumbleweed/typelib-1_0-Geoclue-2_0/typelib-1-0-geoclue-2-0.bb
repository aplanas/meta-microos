SUMMARY = "GeoLocation Framework --GObject Introspection"
DESCRIPTION = "GeoClue is a software framework which can be used to enable geospatial \
awareness in applications. GeoClue uses the D-Bus inter-process \
communication mechanism to provide location information"
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "typelib-1_0-Geoclue-2_0-2.7.0-1.4.aarch64.rpm"
RPM_HASH = "1719aebb0250aac3cd5fd1435cc061ad36567156bef0d2e8fc169c0801f431306a7e0f0fc4c63572cf7d45328ae9b63d7c017b12cd4e056ac13f48b30f915029"

RPROVIDES:${PN} += "typelib-1-0-Geoclue-2-0 \
typelib-Geoclue"

RDEPENDS:${PN} += "libgeoclue-2.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
