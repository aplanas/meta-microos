SUMMARY = "Documentation for Scribus"
DESCRIPTION = "This package provides the documentation for Scribus."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.8"

RPM_NAME = "scribus-doc-1.5.8-5.1.aarch64.rpm"
RPM_HASH = "c44c8047c4258a7940fba96a31d3e9a55b670626c8a10e2a66e7448a4bc99457afa28a00e72500f6700e3b26272a196ecdfdf0f83d040890c00214c95d58e902"

RPROVIDES:${PN} += "scribus-doc"

RDEPENDS:${PN} += ""

inherit rpm
