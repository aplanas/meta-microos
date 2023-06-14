SUMMARY = "GeoIP update client code"
DESCRIPTION = "The GeoIP Update program performs automatic updates of GeoIP2 and GeoIP Legacy \
binary databases. Currently the program only supports Linux and other \
Unix-like systems."
LICENSE = "Apache-2.0 | MIT"

PV = "5.0.3"

RPM_NAME = "geoipupdate-5.0.3-1.2.aarch64.rpm"
RPM_HASH = "f20b500d9fb9878e3bbe80dd79bfa719ad556da4fc3a307c5db93ab5f32f3b059c795aa39fb18b48f4f669ce0b5c13e358564e3ca6df9f8ecea906917ad466e6"

RPROVIDES:${PN} += "config-geoipupdate \
geoipupdate"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6"

inherit rpm
