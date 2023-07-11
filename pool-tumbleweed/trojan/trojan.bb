SUMMARY = "An unidentifiable mechanism that helps you bypass Internet censorship"
DESCRIPTION = "Trojan features multiple protocols over TLS to avoid both active/passive \
detections and ISP QoS limitations. \
 \
Trojan is not a fixed program or protocol. It's an idea, an idea that imitating \
the most common service, to an extent that it behaves identically, could help \
you get across the Great FireWall permanently, without being identified ever. We \
are the GreatER Fire; we ship Trojan Horses."
LICENSE = "GPL-3.0-or-later"

PV = "1.16.0"

RPM_NAME = "trojan-1.16.0-1.15.aarch64.rpm"
RPM_HASH = "3d0be239402ff99814d080c41370da38b8ce04d2a28d989ed010aad6edabc9152fdbc0d9ee13fec205d5261318f353594921131922ed99a1ccaa0c93cdc055e5"

RPROVIDES:${PN} += "config-trojan \
trojan"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libmariadb.so.3 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
