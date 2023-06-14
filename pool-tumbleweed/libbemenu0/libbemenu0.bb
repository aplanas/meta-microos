SUMMARY = "Dynamic menu library inspired by dmenu"
DESCRIPTION = "Library for Bemenu, dynamic menu inspired by dmenu."
LICENSE = "MIT"

PV = "0.6.15"

RPM_NAME = "libbemenu0-0.6.15-1.1.aarch64.rpm"
RPM_HASH = "6a5c815dc7dde724555dcca73af20c7646861e02efd0a693f2cb334dc233a4cbed0de459e63ad5d696999e7d1b9eefc494e86b8174f72debac522acdfabf4839"

RPROVIDES:${PN} += "libbemenu.so.0 \
libbemenu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
bemenu \
libc.so.6"

inherit rpm
