SUMMARY = "Language data for numbertext"
DESCRIPTION = "This package contains data providing information for localized nubertext \
conversions."
LICENSE = "MPL-2.0"

PV = "1.0.11"

RPM_NAME = "libnumbertext-data-1.0.11-1.3.aarch64.rpm"
RPM_HASH = "6b29b5ea303a5495c50bb9ff6620b6725a55938848f4cddae1ff526c857f9e19457c5666d08efa3e54b429e416ccb089ca53ded7ef588d0096e57c0312cd2d91"

RPROVIDES:${PN} += "libnumbertext-data \
libnumbertext-data(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
