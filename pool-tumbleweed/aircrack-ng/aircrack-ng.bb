SUMMARY = "A set of tools for auditing wireless networks"
DESCRIPTION = "Aircrack-ng is a suite of tools to assess network security. \
The main capabilities of aircrack-ng is to monitor, attack, test and crack WiFi networks \
for auditing purposes."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "aircrack-ng-1.7-2.4.aarch64.rpm"
RPM_HASH = "906a673cbe52de5edc50356fb6553bbb8d8b93d564dc30875ec300beffa175ff9dc5ba8fdfa574fb276bc93d86cea9167bc0e885fa8bf5d9157cb8e5e2fe4eb1"

RPROVIDES:${PN} += "aircrack-ng"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ethtool \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libhwloc.so.15 \
libm.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libpcap.so.1 \
libpcre.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1 \
python-abi \
python3-graphviz \
wireless-tools"

inherit rpm
