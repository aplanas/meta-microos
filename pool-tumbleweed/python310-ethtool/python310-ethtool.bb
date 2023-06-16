SUMMARY = "Ethernet settings Python bindings"
DESCRIPTION = "Python bindings for the ethtool kernel interface that allows querying and \
changing of Ethernet interface settings, such as speed, port, autonegotiation, and \
PCI locations."
LICENSE = "GPL-2.0-only"

PV = "0.15"

RPM_NAME = "python310-ethtool-0.15-1.8.aarch64.rpm"
RPM_HASH = "742f1dcbcbfeadf71267ab107147d5b410013883962ac299bbdc651e9705fbf241252e065cdc8a9319820149b65d72f78f622e350431be082f7046253936b2b0"

RPROVIDES:${PN} += "python3-ethtool \
python3.10dist-ethtool \
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
