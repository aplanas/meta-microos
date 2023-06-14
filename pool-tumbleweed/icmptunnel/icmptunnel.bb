SUMMARY = "A tunnel for wrapping IP traffic in ICMP"
DESCRIPTION = "This program transparently tunnels IP traffic through ICMP echo and reply packets."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "icmptunnel-1.0.0-1.2.aarch64.rpm"
RPM_HASH = "d86ce7627b605d852fca635786800ccf77e7540c7d488f8387eda58f8250e781c3e9d78fc9dd602b7bf20d4ec9cb36c03cb50a6d235e94f20096a9a5df18bd07"

RPROVIDES:${PN} += "icmptunnel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
