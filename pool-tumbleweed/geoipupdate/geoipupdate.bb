SUMMARY = "GeoIP update client code"
DESCRIPTION = "The GeoIP Update program performs automatic updates of GeoIP2 and GeoIP Legacy \
binary databases. Currently the program only supports Linux and other \
Unix-like systems."
LICENSE = "Apache-2.0 | MIT"

PV = "5.1.1"

RPM_NAME = "geoipupdate-5.1.1-1.1.aarch64.rpm"
RPM_HASH = "4daada9cf4f3101d43f93beeade0ee2ef65848459c0ed665c9f7edce6ccbd73188402740caf158c1e41cfbb88179a9dc87107a88b1987e4f237f64a6a9a81a2d"

RPROVIDES:${PN} += "config-geoipupdate \
geoipupdate"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
