SUMMARY = "Voice Communication Client for Gamers"
DESCRIPTION = "Low-latency, high-quality voice communication for gamers. Includes game \
linking, so voice from other players comes from the direction of their \
characters, and has echo cancellation so the sound from your loudspeakers \
won't be audible to other players."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "1.5.517"

RPM_NAME = "mumble-1.5.517-1.1.aarch64.rpm"
RPM_HASH = "2cf677d3d68a352dc6d7ad6264f0ba7aea28a13a00302511aac7ff8c1a520c7773de5d3b16e7b8ab5ef8292c31a616583f7550abf70d89892b0773111fbc7f94"

RPROVIDES:${PN} += "application() \
application(info.mumble.Mumble.desktop) \
libamongus.so()(64bit) \
libaoc.so()(64bit) \
libarma2.so()(64bit) \
libbf1.so()(64bit) \
libbf1942.so()(64bit) \
libbf2.so()(64bit) \
libbf2142.so()(64bit) \
libbf3.so()(64bit) \
libbf4.so()(64bit) \
libbf4_x86.so()(64bit) \
libbfbc2.so()(64bit) \
libbfheroes.so()(64bit) \
libblacklight.so()(64bit) \
libborderlands.so()(64bit) \
libborderlands2.so()(64bit) \
libbreach.so()(64bit) \
libcod2.so()(64bit) \
libcod4.so()(64bit) \
libcod5.so()(64bit) \
libcodmw2.so()(64bit) \
libcodmw2so.so()(64bit) \
libcs.so()(64bit) \
libdys.so()(64bit) \
libetqw.so()(64bit) \
libffxiv.so()(64bit) \
libffxiv_x64.so()(64bit) \
libgmod.so()(64bit) \
libgtaiv.so()(64bit) \
libgtasa.so()(64bit) \
libgtav.so()(64bit) \
libgw.so()(64bit) \
libinsurgency.so()(64bit) \
libjc2.so()(64bit) \
liblink.so()(64bit) \
liblol.so()(64bit) \
liblotro.so()(64bit) \
libmumbleoverlay.so.1.5.0()(64bit) \
libql.so()(64bit) \
librl.so()(64bit) \
libse.so()(64bit) \
libsr.so()(64bit) \
libut2004.so()(64bit) \
libut3.so()(64bit) \
libut99.so()(64bit) \
libwolfet.so()(64bit) \
libwow.so()(64bit) \
libwow_x64.so()(64bit) \
mimehandler(x-scheme-handler/mumble) \
mumble \
mumble(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libPocoFoundation.so.92()(64bit) \
libPocoXML.so.92()(64bit) \
libPocoZip.so.92()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libdns_sd.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopus.so.0()(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libspeechd.so.2()(64bit) \
libspeexdsp.so.1()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
lsb-release \
sysuser-shadow"

inherit rpm
