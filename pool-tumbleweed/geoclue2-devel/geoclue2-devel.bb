SUMMARY = "GeoLocation Framework -- Development files"
DESCRIPTION = "GeoClue is a software framework which can be used to enable geospatial \
awareness in applications. GeoClue uses the D-Bus inter-process \
communication mechanism to provide location information"
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "geoclue2-devel-2.7.0-1.4.aarch64.rpm"
RPM_HASH = "9d42a2417e1e6d3729e6b5260a6fbdea96bcac672d172034b605f6a786c8d3684d427025eeee5bebc372d935dcf44088f4bc666aa7a6e2c4ff1ab111bf577d19"

RPROVIDES:${PN} += "geoclue2-devel \
pkgconfig-geoclue-2.0 \
pkgconfig-libgeoclue-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
geoclue2 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
typelib-1-0-Geoclue-2-0"

inherit rpm
