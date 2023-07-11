SUMMARY = "An Erlang providers library"
DESCRIPTION = "An Erlang providers library."
LICENSE = "Apache-2.0"

PV = "1.8.1"

RPM_NAME = "erlang-providers-1.8.1-1.2.aarch64.rpm"
RPM_HASH = "929f01c4f41503666694b81492f3d4df4aa47b28cff205edfa1d44937de77f1e34bf56d3a295e365d46b0823fe702fecaf03fbcdda0c7064f1a2af6fe7929cd3"

RPROVIDES:${PN} += "erlang-providers"

RDEPENDS:${PN} += "erlang \
erlang-getopt"

inherit rpm
