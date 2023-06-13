SUMMARY = "Python3 bindings for Open vSwitch"
DESCRIPTION = "This package contains the Python3 bindings for Open vSwitch database."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python3-ovs-3.1.0-14.1.aarch64.rpm"
RPM_HASH = "8e97179633aa55fb339dff525e5d0f595bcac4a1852ecd85ce192f1d3b032b01257d84d3b331007978576a133d395454d7296ee9b070edcd101cda73a043be02"

RPROVIDES:${PN} += "python3-openvswitch \
python3-ovs \
python3-ovs(aarch-64) \
python3.10dist(ovs) \
python3dist(ovs)"

RDEPENDS:${PN} += "libopenvswitch-3_1-0 \
python(abi) \
python3 \
python3-sortedcontainers"

inherit rpm
