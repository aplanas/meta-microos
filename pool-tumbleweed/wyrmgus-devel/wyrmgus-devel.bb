SUMMARY = "Real-time strategy gaming engine development files"
DESCRIPTION = "These are the development files for Wyrmsun which is based on the Stratagus engine."
LICENSE = "GPL-2.0-only"

PV = "5.3.6"

RPM_NAME = "wyrmgus-devel-5.3.6-2.6.aarch64.rpm"
RPM_HASH = "99999040ec7500599fc0edd5d1fbb3e51224c8359a256d4a0d0ee4bf72a9e0385d18bee0314add6665e76f200a37f57373c5fd2b3b9aeea613f22e36c82b3243"

RPROVIDES:${PN} += "wyrmgus-devel"

RDEPENDS:${PN} += "wyrmgus"

inherit rpm
