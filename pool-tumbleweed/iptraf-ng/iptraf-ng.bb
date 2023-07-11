SUMMARY = "TCP/IP Network Monitor"
DESCRIPTION = "IPTraf-ng is a console-based network statistics utility. It gathers a \
variety of information such as TCP connection packet and byte counts, \
interface statistics and activity indicators, TCP/UDP traffic \
breakdowns, and LAN station packet and byte counts."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "iptraf-ng-1.2.1-2.12.aarch64.rpm"
RPM_HASH = "f33d4cff73046885879965c681b6d2ad23b6b1bb349a23f022c2c807b88f8845ed0448f31553abc9c3a039acd5f4b2b673afb80c64171f972f88e719b2e1d7d2"

RPROVIDES:${PN} += "iptraf \
iptraf-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6"

inherit rpm
