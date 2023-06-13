SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.38.1"

RPM_NAME = "libuuid-devel-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "a0bc09d136fef4ff5b0deed1f12d9bbc764b5153240a42a957af54aab30274d2398b8eaa538b1a3510a9cecabea8642294080740f17f04d6a60e91fa4e660344"

RPROVIDES:${PN} += "libuuid-devel \
libuuid-devel(aarch-64) \
pkgconfig(uuid)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuuid1"

inherit rpm
