SUMMARY = "Open vSwitch Documentation"
DESCRIPTION = "Contains additional documentation for the Open vSwitch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-doc-3.1.0-15.1.noarch.rpm"
RPM_HASH = "12c37db449dc168fe53135db291170e0952c2f128b542b9035940a8e91253ccbd6f161becf8fce72fbe8afffefcca855867acc1fa49e2abb93ff3f6a7bb1a7d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openvswitch-doc"

RDEPENDS:${PN} += ""

inherit rpm
