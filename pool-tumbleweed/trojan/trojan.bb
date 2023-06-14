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

RPM_NAME = "trojan-1.16.0-1.14.aarch64.rpm"
RPM_HASH = "1401ee4179197288ab0d124ba9d465bad6540f0f29f8e8edb01bee790bf125bd338cf2c8eae4862a1e0db3e04263ecd806fe63470a3b2cd4f424c0e514b37ad0"

RPROVIDES:${PN} += "config-trojan \
trojan"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libmariadb.so.3 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
