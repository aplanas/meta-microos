SUMMARY = "GCR-specific variant of crane"
DESCRIPTION = "crane is a GCR-specific variant of crane that has richer output for the ls \
subcommand and some basic garbage collection support."
LICENSE = "Apache-2.0"

PV = "0.12.1"

RPM_NAME = "gcrane-0.12.1-1.3.aarch64.rpm"
RPM_HASH = "5f2fefbe0129d81964fb57c71165d88d972c28d087b12afce97c3afde1f9e29dcfd953957a72774ff9d6d97491111cc7ad23762239cf1e3335027c7301ec6f20"

RPROVIDES:${PN} += "gcrane \
gcrane(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
