SUMMARY = "Voice Communication Server for Gamers"
DESCRIPTION = "Low-latency, high-quality voice communication for gamers. Includes game \
linking, so voice from other players comes from the direction of their \
characters, and has echo cancellation so the sound from your loudspeakers \
won't be audible to other players."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "1.5.517"

RPM_NAME = "mumble-server-1.5.517-1.1.aarch64.rpm"
RPM_HASH = "401494ff00a0920e899c34f05d47fcbc98a423bf22bdd34f1dfd98bae9e85187204b0d073b4856ac5db84cc7c14d0d2a579076409fddc38d6ed387e8655d37d9"

RPROVIDES:${PN} += "config(mumble-server) \
group(_mumble-server) \
metainfo() \
metainfo(info.mumble.Mumble.appdata.xml) \
mumble-server \
mumble-server(aarch-64) \
user(_mumble-server)"
RDEPENDS:${PN} += "/bin/sh \
/usr/sbin/useradd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libdns_sd.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
lsb-release \
systemd"

inherit rpm
