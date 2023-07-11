SUMMARY = "Open vSwitch IPsec tunneling support"
DESCRIPTION = "This package provides IPsec tunneling support for OVS tunnels."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-ipsec-3.1.0-14.3.aarch64.rpm"
RPM_HASH = "e869165eea3d540ec2bfd34eb45d1ecc2bc13cf3fbbe1d7a49344755141a9c6fe00baa62f5ef448e80b55a4857457ba563dc95176ac78deab7ace0cb2814bbca"

RPROVIDES:${PN} += "openvswitch-ipsec"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
openvswitch \
python3-ovs \
strongswan"

inherit rpm
