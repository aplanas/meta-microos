SUMMARY = "Voice Communication Server for Gamers"
DESCRIPTION = "Low-latency, high-quality voice communication for gamers. Includes game \
linking, so voice from other players comes from the direction of their \
characters, and has echo cancellation so the sound from your loudspeakers \
won't be audible to other players."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "1.5.517"

RPM_NAME = "mumble-server-1.5.517-1.2.aarch64.rpm"
RPM_HASH = "d593a83c2b5ac1f5e98ad5450e5671b708a022ebf55afa1b151b98d870ab06ed151e74df33a7c0ad3329d9b85cd100d63a0de134ad23d323ff7f261cbb4a9d23"

RPROVIDES:${PN} += "config-mumble-server \
group--mumble-server \
mumble-server \
user--mumble-server"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/useradd \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libdns-sd.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libprotobuf-3.21.12.so \
libssl.so.3 \
libstdc++.so.6 \
lsb-release \
systemd"

inherit rpm
