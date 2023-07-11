SUMMARY = "Ethernet settings Python bindings"
DESCRIPTION = "Python bindings for the ethtool kernel interface that allows querying and \
changing of Ethernet interface settings, such as speed, port, autonegotiation, and \
PCI locations."
LICENSE = "GPL-2.0-only"

PV = "0.15"

RPM_NAME = "python39-ethtool-0.15-1.10.aarch64.rpm"
RPM_HASH = "a07535e41c9bcd765998f256e463cf3ac1b89257c43f35f0dd155e2189da77a05990a598d918530fcc7a5d3534e44eb0ad05f958dcb8317736846d391e6cf940"

RPROVIDES:${PN} += "python3.9dist-ethtool \
python39-ethtool \
python3dist-ethtool"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200 \
python-abi \
update-alternatives"

inherit rpm
