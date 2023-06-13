SUMMARY = "GeoLocation Framework -- Development files"
DESCRIPTION = "GeoClue is a software framework which can be used to enable geospatial \
awareness in applications. GeoClue uses the D-Bus inter-process \
communication mechanism to provide location information"
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "geoclue2-devel-2.7.0-1.3.aarch64.rpm"
RPM_HASH = "a91767e070a92beb42cc079416dab44d6fec9426396c81caa2f2690f603065df5bdda224c5c2c15cf1b7e136f0c4591fb803a61de0ba791254ffa12d783a8d55"

RPROVIDES:${PN} += "geoclue2-devel \
geoclue2-devel(aarch-64) \
pkgconfig(geoclue-2.0) \
pkgconfig(libgeoclue-2.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
geoclue2 \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
typelib-1_0-Geoclue-2_0"

inherit rpm
