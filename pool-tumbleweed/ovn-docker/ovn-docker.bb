SUMMARY = "Docker network plugins for OVN"
DESCRIPTION = "This subpackage contains the OVN Docker network plugins."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-docker-23.03.0-15.1.aarch64.rpm"
RPM_HASH = "0262773261ff4a28a582cf753f281a2217010e41a4cebb1c0579bff21b90294f837f541eb73f106fbb0f40cfdccdcb51610c6bd1ab6c5f8927db5229263eb322"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn-/usr/bin/ovn-docker-overlay-driver \
openvswitch-ovn-/usr/bin/ovn-docker-overlay-driver \
openvswitch-ovn-docker \
ovn-docker"

RDEPENDS:${PN} += "/usr/bin/python3 \
openvswitch \
ovn \
python3-openvswitch"

inherit rpm
