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

RPROVIDES:${PN} += "config(trojan) \
trojan \
trojan(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
