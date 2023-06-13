SUMMARY = "Open vSwitch IPsec tunneling support"
DESCRIPTION = "This package provides IPsec tunneling support for OVS tunnels."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-ipsec-3.1.0-14.1.aarch64.rpm"
RPM_HASH = "1752023f1b69d9cb8734286a5924599893b733469a501a6b1002cd2e39580dad5e3c189f2230b9431d7e86ab6fdf8a0abf857a7a1b8f65a86d416feba3713b33"

RPROVIDES:${PN} += "openvswitch-ipsec \
openvswitch-ipsec(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
openvswitch \
python3-ovs \
strongswan"

inherit rpm
