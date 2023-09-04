SUMMARY = "GeoIP update client code"
DESCRIPTION = "The GeoIP Update program performs automatic updates of GeoIP2 and GeoIP Legacy \
binary databases. Currently the program only supports Linux and other \
Unix-like systems."
LICENSE = "Apache-2.0 | MIT"

PV = "6.0.0"

RPM_NAME = "geoipupdate-6.0.0-1.1.aarch64.rpm"
RPM_HASH = "38ba4a3c9c3288736fe955184f4cfb795f69fdf0e6eff05124ac1d034539d4ae848dc4c8e6a32c4f6afed114ed6cd75f019d30fbfe030523f6147d567fa93e8d"

RPROVIDES:${PN} += "config-geoipupdate \
geoipupdate"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
