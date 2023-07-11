SUMMARY = "Ethernet settings Python bindings"
DESCRIPTION = "Python bindings for the ethtool kernel interface that allows querying and \
changing of Ethernet interface settings, such as speed, port, autonegotiation, and \
PCI locations."
LICENSE = "GPL-2.0-only"

PV = "0.15"

RPM_NAME = "python310-ethtool-0.15-1.10.aarch64.rpm"
RPM_HASH = "c9e219063518715f6701bb4c1f08aa8bfd3bf16a1ebfbb06daee66dd0554235389252d82495092554f6105ba0271ca9b66ca7d43f026d0fb6b63eac6915596e0"

RPROVIDES:${PN} += "python3.10dist-ethtool \
python310-ethtool \
python3dist-ethtool"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200 \
python-abi \
update-alternatives"

inherit rpm
