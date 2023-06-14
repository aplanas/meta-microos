SUMMARY = "Voice Communication Client for Gamers"
DESCRIPTION = "Low-latency, high-quality voice communication for gamers. Includes game \
linking, so voice from other players comes from the direction of their \
characters, and has echo cancellation so the sound from your loudspeakers \
won't be audible to other players."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "1.5.517"

RPM_NAME = "mumble-1.5.517-1.1.aarch64.rpm"
RPM_HASH = "2cf677d3d68a352dc6d7ad6264f0ba7aea28a13a00302511aac7ff8c1a520c7773de5d3b16e7b8ab5ef8292c31a616583f7550abf70d89892b0773111fbc7f94"

RPROVIDES:${PN} += "libamongus.so \
libaoc.so \
libarma2.so \
libbf1.so \
libbf1942.so \
libbf2.so \
libbf2142.so \
libbf3.so \
libbf4-x86.so \
libbf4.so \
libbfbc2.so \
libbfheroes.so \
libblacklight.so \
libborderlands.so \
libborderlands2.so \
libbreach.so \
libcod2.so \
libcod4.so \
libcod5.so \
libcodmw2.so \
libcodmw2so.so \
libcs.so \
libdys.so \
libetqw.so \
libffxiv-x64.so \
libffxiv.so \
libgmod.so \
libgtaiv.so \
libgtasa.so \
libgtav.so \
libgw.so \
libinsurgency.so \
libjc2.so \
liblink.so \
liblol.so \
liblotro.so \
libmumbleoverlay.so.1.5.0 \
libql.so \
librl.so \
libse.so \
libsr.so \
libut2004.so \
libut3.so \
libut99.so \
libwolfet.so \
libwow-x64.so \
libwow.so \
mumble"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libPocoXML.so.92 \
libPocoZip.so.92 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libXi.so.6 \
libasound.so.2 \
libc.so.6 \
libcrypto.so.3 \
libdns-sd.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libopus.so.0 \
libprotobuf-3.21.12.so \
libsndfile.so.1 \
libspeechd.so.2 \
libspeexdsp.so.1 \
libssl.so.3 \
libstdc++.so.6 \
lsb-release \
sysuser-shadow"

inherit rpm
