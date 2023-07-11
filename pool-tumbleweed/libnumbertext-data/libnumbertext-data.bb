SUMMARY = "Language data for numbertext"
DESCRIPTION = "This package contains data providing information for localized nubertext \
conversions."
LICENSE = "MPL-2.0"

PV = "1.0.11"

RPM_NAME = "libnumbertext-data-1.0.11-1.4.aarch64.rpm"
RPM_HASH = "2db5d44d6467eebcf69ae1562bc91c1bf793badf738323b6f076eca9f03f61c57908aed5a6590ca3cb56f698f6a26631ee61e82f3e18806a6a43bed526a1ead3"

RPROVIDES:${PN} += "libnumbertext-data"

RDEPENDS:${PN} += ""

inherit rpm
