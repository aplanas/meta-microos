SUMMARY = "Main API of the Diameter application"
DESCRIPTION = "This module provides the interface with which a user can implement a Diameter \
node that sends and receives messages using the Diameter protocol as defined in \
RFC 6733."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-diameter-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "b2bf4f011a811308adfae2fe4665c0096c7c64e161ee329fc41011dd61daca74fe9bb5a635c23b4d7ea874423e58f29325d411869f0380fc9e355760ea4df0f9"

RPROVIDES:${PN} += "erlang-diameter erlang-diameter(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env erlang"

inherit rpm
