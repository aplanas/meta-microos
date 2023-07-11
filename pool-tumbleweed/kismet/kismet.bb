SUMMARY = "An 802.11 Wireless Network Sniffer"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
Kismet works with Wi-Fi interfaces, Bluetooth interfaces, some \
SDR (software defined radio) hardware like the RTLSDR, and other \
specialized capture hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "7f9175a4a6a704de51b7c2aee45b624f062268a014cbc15d8b29336f02382d02c38a383ec9eb9275425a116165a5c9f31a58b1f0c8e53b34ff5d0cef5d2d92cb"

RPROVIDES:${PN} += "config-kismet \
group-kismet \
kismet \
user-kismet"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcap.so.1 \
libpcre.so.1 \
libprotobuf-3.21.12.so \
libprotobuf-c.so.1 \
libsensors.so.4 \
libsqlite3.so.0 \
libstdc++.so.6 \
libwebsockets.so.19 \
libz.so.1 \
permissions \
shadow \
sysuser-shadow"

inherit rpm
