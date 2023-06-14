SUMMARY = "An 802.11 Wireless Network Sniffer"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
Kismet works with Wi-Fi interfaces, Bluetooth interfaces, some \
SDR (software defined radio) hardware like the RTLSDR, and other \
specialized capture hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "8ebca14483d147f2be202d3dbd688d4c534f1b82564aa3a256adc530b3c0041de7de16e263625b9623f718e259efb24f74734f47e51aa55c0b175ee5f3e3948a"

RPROVIDES:${PN} += "config-kismet \
group-kismet \
kismet \
user-kismet"

RDEPENDS:${PN} += "/bin/sh \
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
