SUMMARY = "Headers for the unstable API of the Qt5 BodyMovin library"
DESCRIPTION = "You need this package if you want to compile programs against the unstable API \
of the Qt5 BodyMovin library."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5Bodymovin-private-headers-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "dfc40d38f19f6bdd07768ccc8f87f3a6d34f2381da336526a5c93c916f6e08a807b589410812be18468644632686157c96dc1fb9205ebb99dcc5b17dcafdf63f"

RPROVIDES:${PN} += "libQt5Bodymovin-private-headers-devel"

RDEPENDS:${PN} += "libQt5Bodymovin-devel"

inherit rpm
