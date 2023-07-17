SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.39"

RPM_NAME = "libuuid-devel-static-2.39-2.1.aarch64.rpm"
RPM_HASH = "92623ceaebb01377ee099325e0f7ca649593df256000eb875515f3b94f649098427953e0787659842eb658998c844decd233851c10b3db6fae5cd3ea2acffb8e"

RPROVIDES:${PN} += "libuuid-devel-static"

RDEPENDS:${PN} += "libuuid-devel"

inherit rpm
