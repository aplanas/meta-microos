SUMMARY = "Bi-directional ping utility"
DESCRIPTION = "2ping is a bi-directional ping utility. It uses 3-way pings (akin to TCP SYN, \
SYN/ACK, ACK) and after-the-fact state comparison between a 2ping listener and \
a 2ping client to determine which direction packet loss occurs."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.1"

RPM_NAME = "2ping-4.5.1-4.2.noarch.rpm"
RPM_HASH = "0201ab4add472c058d2379ad105ec489803cad9e47c5c17000b5234c7777b5c967b1d64627e5ffb69d6c80c0ade305bb63834dde5e4cfa99c06ee9503da7656e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "2ping \
python3.10dist-2ping \
python3dist-2ping"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3 \
systemd"

inherit rpm
