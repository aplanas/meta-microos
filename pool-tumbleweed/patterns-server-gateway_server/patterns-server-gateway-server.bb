SUMMARY = "Internet Gateway"
DESCRIPTION = "Software to set up a proxy, firewall, and gateway server, including a virtual private network (VPN) gateway."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-gateway_server-20210330-5.1.aarch64.rpm"
RPM_HASH = "4f6a947a69235b853995b5a114f648c6f1eecf7f2360d4570b0c83654363d50149911d2bdb5076fd8b1ace902a52c91becc6b7f25420662534b7934516e9fcb6"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-openSUSE-gateway_server \
patterns-server-gateway_server \
patterns-server-gateway_server(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
