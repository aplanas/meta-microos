SUMMARY = "Ethernet settings Python bindings"
DESCRIPTION = "Python bindings for the ethtool kernel interface that allows querying and \
changing of Ethernet interface settings, such as speed, port, autonegotiation, and \
PCI locations."
LICENSE = "GPL-2.0-only"

PV = "0.15"

RPM_NAME = "python311-ethtool-0.15-1.8.aarch64.rpm"
RPM_HASH = "a7ed2ff3cfb3d73e6b6d009a82990b08abbffa8ab8a199b4f85ce72377d0ea857b4486841d6f9d66534f7003a6a5524c2defcf395053a4221dd1fa1bd8322d36"

RPROVIDES:${PN} += "python3.11dist-ethtool \
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
