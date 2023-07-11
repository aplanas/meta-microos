SUMMARY = "Main API of the Diameter application"
DESCRIPTION = "This module provides the interface with which a user can implement a Diameter \
node that sends and receives messages using the Diameter protocol as defined in \
RFC 6733."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-diameter-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "7da16bb65c18b5c36a771cd3da3fbafa7083200cf075bd055d0a54038c5c473aeffc7902c07fbf88aeac600e03a9dbfa22461a262707810e04c98e387dafb6db"

RPROVIDES:${PN} += "erlang-diameter"

RDEPENDS:${PN} += "/usr/bin/env \
erlang"

inherit rpm
