SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.39.1"

RPM_NAME = "libuuid-devel-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "06a6a8496d92158e42fabd416a4cd38d2e3af84566816abbd67e5ff9f0ba5da5cfda20203aad71035d915de90d996ffd712a234eb7771c28bc9266ccf1e24591"

RPROVIDES:${PN} += "libuuid-devel \
pkgconfig-uuid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuuid1"

inherit rpm
