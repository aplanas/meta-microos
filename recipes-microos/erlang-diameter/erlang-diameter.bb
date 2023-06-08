SUMMARY = "Main API of the Diameter application"
DESCRIPTION = "This module provides the interface with which a user can implement a Diameter \
node that sends and receives messages using the Diameter protocol as defined in \
RFC 6733."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-diameter-25.3-1.1.aarch64.rpm"
RPM_HASH = "2b8f63b84c2537ba321c8ecb18a0752ac6637bb0f36f5bcea89e51be55679ad627019f71f721e1810a5ec613e08dd1f6841e758a4c29a5b452707c5085b3524f"

RPROVIDES:${PN} += "erlang-diameter erlang-diameter(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env erlang"

inherit rpm
