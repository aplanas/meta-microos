SUMMARY = "Bobcat static library"
DESCRIPTION = "Bobcat static library"
LICENSE = "GPL-3.0-only"

PV = "6.02.02"

RPM_NAME = "libbobcat-devel-static-6.02.02-2.3.aarch64.rpm"
RPM_HASH = "29526f25323d2b2873488facde2c5e9d0953bfe32bdafe702349c2e41c0554585b1442b6d288808543acabbaf10e09de4112bb119d94653e8006c3ffe902b663"

RPROVIDES:${PN} += "libbobcat-devel-static \
libbobcat-devel-static(aarch-64)"

RDEPENDS:${PN} += "libbobcat-devel"

inherit rpm
