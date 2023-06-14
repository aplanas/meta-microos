SUMMARY = "Development package for kdav"
DESCRIPTION = "This package contains development files needed to use kdav in other applications."
LICENSE = "LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "kdav-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "5034d66dcdb857425e4ba7178c2b18f7aa2639d9a64cfa1b9a15303d1cb55b480f12f29422c0c79f8e9b08caa40ca9b2a20689a72734b5c4b47056396616fb18"

RPROVIDES:${PN} += "cmake-KF5DAV \
kdav-devel"

RDEPENDS:${PN} += "libKF5DAV5"

inherit rpm
