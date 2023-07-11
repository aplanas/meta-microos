SUMMARY = "Bi-directional ping utility"
DESCRIPTION = "2ping is a bi-directional ping utility. It uses 3-way pings (akin to TCP SYN, \
SYN/ACK, ACK) and after-the-fact state comparison between a 2ping listener and \
a 2ping client to determine which direction packet loss occurs."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.1"

RPM_NAME = "2ping-4.5.1-4.3.noarch.rpm"
RPM_HASH = "3cc75debde053a2a2d221a5229e7cd3464f13d9497002ade45802cca710ab0b330783a2b10605719662f5d58ffb53d57086b0446be224d543dc5cc1afdf98c7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "2ping \
python3.11dist-2ping \
python3dist-2ping"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3 \
systemd"

inherit rpm
