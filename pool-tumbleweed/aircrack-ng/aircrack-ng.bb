SUMMARY = "A set of tools for auditing wireless networks"
DESCRIPTION = "Aircrack-ng is a suite of tools to assess network security. \
The main capabilities of aircrack-ng is to monitor, attack, test and crack WiFi networks \
for auditing purposes."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "aircrack-ng-1.7-2.3.aarch64.rpm"
RPM_HASH = "20bde22c8e1a416e041d77c9baf005530a2710f9f2b07081db9ce3bb53efb6b83c4cc3b0e4118e1b154fd600794b012ecc758a80418a65a5891f413bb83811cb"

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
