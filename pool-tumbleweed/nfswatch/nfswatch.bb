SUMMARY = "An NFS traffic monitoring tool"
DESCRIPTION = "Nfswatch is a command-line tool for monitoring NFS traffic. \
Nfswatch can capture and analyze the NFS packets on a particular \
network interface or on all interfaces."
LICENSE = "BSD-2-Clause"

PV = "4.99.11"

RPM_NAME = "nfswatch-4.99.11-2.16.aarch64.rpm"
RPM_HASH = "eb0e4ff769e2c52da9a130f5e4af06232f27bb5a077d4e807a2a4122977c4c9464fb213692d44e4dff48b0ee7a58e9943e1736c97f4dd59764e2097e2674a62f"

RPROVIDES:${PN} += "nfswatch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libpcap.so.1 \
libtinfo.so.6 \
libtirpc.so.3"

inherit rpm
