SUMMARY = "An 802.11 Wireless Network Sniffer"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
Kismet works with Wi-Fi interfaces, Bluetooth interfaces, some \
SDR (software defined radio) hardware like the RTLSDR, and other \
specialized capture hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-2023_07_R1-1.1.aarch64.rpm"
RPM_HASH = "4221021825ee9da40caf3cddd0b061a2f3b3961bebffab38444d9fe7ec97cf8a5f241d1bdc11e4a6800dd80df3ebe2645f4010734dd980d07dcddb5d369ba7e8"

RPROVIDES:${PN} += "config-kismet \
kismet"

RDEPENDS:${PN} += "/usr/bin/sh \
kismet-common \
ld-linux-aarch64.so.1 \
libabsl-log-internal-check-op.so.2301.0.0 \
libabsl-log-internal-message.so.2301.0.0 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpcap.so.1 \
libpcre2-8.so.0 \
libprotobuf-c.so.1 \
libprotobuf.so.23.4.0 \
libsensors.so.4 \
libsqlite3.so.0 \
libstdc++.so.6 \
libwebsockets.so.19 \
libz.so.1 \
permissions \
shadow"

inherit rpm
