SUMMARY = "Docker network plugins for OVN"
DESCRIPTION = "This subpackage contains the OVN Docker network plugins."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-docker-23.03.0-14.3.aarch64.rpm"
RPM_HASH = "1ac12119d9782bd9e7b3ef6551d8280ada3a7e991be2b265383fcba8a04d43f8f23971b0fb8d1fa5d6fc9f8e31cbf46a4eaaf171910269be945eaa920fb17adc"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn-/usr/bin/ovn-docker-overlay-driver \
openvswitch-ovn-/usr/bin/ovn-docker-overlay-driver \
openvswitch-ovn-docker \
ovn-docker"

RDEPENDS:${PN} += "/usr/bin/python3 \
openvswitch \
ovn \
python3-openvswitch"

inherit rpm
