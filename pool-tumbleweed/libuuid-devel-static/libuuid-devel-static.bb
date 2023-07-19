SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.39"

RPM_NAME = "libuuid-devel-static-2.39-3.1.aarch64.rpm"
RPM_HASH = "6f2268c8a1b3ac19cfb471802bfe082ca4e7bdf434b308b249cf4ddce765083ce863eeeae2a56d4c696621a3bb27ba6ac2b3bdf9bdca87fc68d1c96e1c9416bb"

RPROVIDES:${PN} += "libuuid-devel-static"

RDEPENDS:${PN} += "libuuid-devel"

inherit rpm
