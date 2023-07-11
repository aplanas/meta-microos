SUMMARY = "Network emulator for rapid prototyping of Software Defined Networks (SDN)"
DESCRIPTION = "Mininet emulates a complete network of hosts, links, and switches on a single \
machine. Mininet is useful for interactive development, testing, and demos, especially \
those using OpenFlow and SDN. OpenFlow-based network controllers prototyped in \
Mininet can usually be transferred to hardware with minimal changes for full \
line-rate execution."
LICENSE = "MIT & GPL-2.0-or-later"

PV = "2.3.0"

RPM_NAME = "mininet-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "5715f86897a5dfbb02171a5563c7b294c29d4a3b375f0ba93288a751ed66d815d9bfec1dfd52bc7b692915bcb554a39e3fea8ffb58e19bb586c2bc464716b7a4"

RPROVIDES:${PN} += "mininet \
python3.11dist-mininet \
python3dist-mininet"

RDEPENDS:${PN} += "/usr/bin/python3 \
ethtool \
iperf \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
openvswitch \
python-abi \
socat \
telnet"

inherit rpm
