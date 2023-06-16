SUMMARY = "Ethernet settings Python bindings"
DESCRIPTION = "Python bindings for the ethtool kernel interface that allows querying and \
changing of Ethernet interface settings, such as speed, port, autonegotiation, and \
PCI locations."
LICENSE = "GPL-2.0-only"

PV = "0.15"

RPM_NAME = "python39-ethtool-0.15-1.8.aarch64.rpm"
RPM_HASH = "7ad697b2a6810e7c08894e5672ab9bb44e1e0fe97dcd1bf17b6e0ee4d66794f7c9af6cbe5447841488cf458fd301f6cc0736f7c3a9c593a7aa32a130d407a02b"

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
