SUMMARY = "Ethernet settings Python bindings"
DESCRIPTION = "Python bindings for the ethtool kernel interface that allows querying and \
changing of Ethernet interface settings, such as speed, port, autonegotiation, and \
PCI locations."
LICENSE = "GPL-2.0-only"

PV = "0.15"

RPM_NAME = "python311-ethtool-0.15-1.10.aarch64.rpm"
RPM_HASH = "37d076347e66f79524ce4e631a510fcf3c490c463c0535de8ebe45946b81892d5a6398182dcf1ff1e6a873127f17d7fe5c9714f653063df626670f72c62b3b45"

RPROVIDES:${PN} += "python3-ethtool \
python3.11dist-ethtool \
python311-ethtool \
python3dist-ethtool"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200 \
python-abi \
update-alternatives"

inherit rpm
