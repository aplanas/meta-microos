SUMMARY = "Ethernet settings Python bindings"
DESCRIPTION = "Python bindings for the ethtool kernel interface that allows querying and \
changing of Ethernet interface settings, such as speed, port, autonegotiation, and \
PCI locations."
LICENSE = "GPL-2.0-only"

PV = "0.15"

RPM_NAME = "python311-ethtool-0.15-1.8.aarch64.rpm"
RPM_HASH = "a7ed2ff3cfb3d73e6b6d009a82990b08abbffa8ab8a199b4f85ce72377d0ea857b4486841d6f9d66534f7003a6a5524c2defcf395053a4221dd1fa1bd8322d36"

RPROVIDES:${PN} += "python3.11dist(ethtool) \
python311-ethtool \
python311-ethtool(aarch-64) \
python3dist(ethtool)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-route-3.so.200()(64bit) \
libnl-route-3.so.200(libnl_3)(64bit) \
python(abi) \
update-alternatives"

inherit rpm
