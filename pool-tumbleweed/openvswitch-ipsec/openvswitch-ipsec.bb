SUMMARY = "Open vSwitch IPsec tunneling support"
DESCRIPTION = "This package provides IPsec tunneling support for OVS tunnels."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-ipsec-3.1.0-15.1.aarch64.rpm"
RPM_HASH = "8e2c9c5d951c26393d25f83730207bbc1cd623cd3dfa103d9040376eaf790d5cff8b433d62cb0650a0de3f933b55af7035915cb24bb897852f11b8ae47d22d58"

RPROVIDES:${PN} += "openvswitch-ipsec"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
openvswitch \
python3-ovs \
strongswan"

inherit rpm
