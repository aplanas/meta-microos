SUMMARY = "Docker network plugins for OVN"
DESCRIPTION = "This subpackage contains the OVN Docker network plugins."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-docker-23.03.0-14.1.aarch64.rpm"
RPM_HASH = "a4ee8674a481724b213fb30396de66cab40432c2ebfdf4701e92130acf0876c864333657ea1a1561e339633a82643bb3f86d2e2148f768b169af0355bae35017"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn:/usr/bin/ovn-docker-overlay-driver \
openvswitch-ovn-docker \
openvswitch-ovn:/usr/bin/ovn-docker-overlay-driver \
ovn-docker \
ovn-docker(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
openvswitch \
ovn \
python3-openvswitch"

inherit rpm
