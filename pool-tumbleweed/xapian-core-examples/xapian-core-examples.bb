SUMMARY = "Examples for Xapian-core libraries"
DESCRIPTION = "Xapian is a Probabilistic Information Retrieval Library. \
 \
This subpackage contains some examples for Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "xapian-core-examples-1.4.21-1.3.aarch64.rpm"
RPM_HASH = "f928d318d1d0eb9b03bf2741dcc16dca995e000c165fdc8afd636ea2415cf9b6fb7445d14e38183f10a284950e06083fef74d67556d422c252e412b9e1b713e9"

RPROVIDES:${PN} += "xapian-core-examples"

RDEPENDS:${PN} += "xapian-core"

inherit rpm
