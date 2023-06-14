SUMMARY = "TCP/IP Network Monitor"
DESCRIPTION = "IPTraf-ng is a console-based network statistics utility. It gathers a \
variety of information such as TCP connection packet and byte counts, \
interface statistics and activity indicators, TCP/UDP traffic \
breakdowns, and LAN station packet and byte counts."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "iptraf-ng-1.2.1-2.11.aarch64.rpm"
RPM_HASH = "40b0624976af23f5e2d91bcc8e952364bac13eaeccf38015f8f176e1329d98b36e49a1e205b2a82954de6693bd6a1aa4c1e28ee72a00790c43a827c7c503e281"

RPROVIDES:${PN} += "iptraf \
iptraf-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6"

inherit rpm
