SUMMARY = "Utility for examining and tuning Ethernet-based network interfaces"
DESCRIPTION = "Ethtool is a small utility for examining and tuning ethernet-based \
network interfaces.  See the man page for more details."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "ethtool-6.3-1.1.aarch64.rpm"
RPM_HASH = "54f6b0ff0de07022a7757ed9b9e2ec6881a2ea86b50617d69fa9c47e286cd7073e5f019689dd0127ed470a6e5d93e3c5ecf7227c444e098176e049bd49edda00"

RPROVIDES:${PN} += "ethtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmnl.so.0"

inherit rpm
