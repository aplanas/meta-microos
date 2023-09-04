SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.39.1"

RPM_NAME = "libuuid-devel-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "63bfb6f48ec95cef9874a3bebe88cbfe338eea83f048ca4a13b5340af0442e14594f841e9697abcc2fc6fc1daff09c19f0ab46e47fc12e5558b5dac4afbd8f3e"

RPROVIDES:${PN} += "libuuid-devel \
pkgconfig-uuid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuuid1"

inherit rpm
