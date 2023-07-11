SUMMARY = "Python3 bindings for Open vSwitch"
DESCRIPTION = "This package contains the Python3 bindings for Open vSwitch database."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python3-ovs-3.1.0-14.3.aarch64.rpm"
RPM_HASH = "288da13377465835e4a1ca05c8cdd408645aa92301f7169e767cf804db4aeada0c473377a6d2472f6e2b5e215b519287a7570a558faea5212dc6e7c02ada458c"

RPROVIDES:${PN} += "python3-openvswitch \
python3-ovs \
python3.11dist-ovs \
python3dist-ovs"

RDEPENDS:${PN} += "libopenvswitch-3-1-0 \
python-abi \
python3 \
python3-sortedcontainers"

inherit rpm
