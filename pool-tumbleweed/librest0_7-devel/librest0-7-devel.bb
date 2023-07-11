SUMMARY = "Library to access RESTful web services - Development Files"
DESCRIPTION = "This library was designed to make it easier to access web services that \
claim to be 'RESTful'. A reasonable description is that a RESTful \
service should have urls that represent remote objects, which methods \
can then be called on."
LICENSE = "LGPL-2.1-only"

PV = "0.8.1"

RPM_NAME = "librest0_7-devel-0.8.1-2.4.aarch64.rpm"
RPM_HASH = "a0466848ebf652a617abf1bf62226805c07c332a5248fe0af90c49bbae0097246f605fd5b675c750cda0c67667a196d75a70864257e6651e0e61777e0d5f2109"

RPROVIDES:${PN} += "librest0-7-devel \
pkgconfig-rest-0.7 \
pkgconfig-rest-extras-0.7"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librest-0-7-0 \
pkgconfig-glib-2.0 \
pkgconfig-libsoup-2.4 \
pkgconfig-libxml-2.0 \
typelib-1-0-Rest-0-7"

inherit rpm
