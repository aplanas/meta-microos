SUMMARY = "Remote shell that survives IP roaming and disconnect"
DESCRIPTION = "Eternal Terminal (ET) is a remote shell that automatically reconnects without \
interrupting the session."
LICENSE = "Apache-2.0"

PV = "6.2.4"

RPM_NAME = "EternalTerminal-6.2.4-3.1.aarch64.rpm"
RPM_HASH = "77d7e36668c3e86ce7471e60b1821598245bcadeef24e42c1c8415d25a74d7d9d4c3a41fe09f03307a5ad62013e278d495d7015d56ad53ab0b3a92e14a709d38"

RPROVIDES:${PN} += "EternalTerminal \
EternalTerminal(aarch-64) \
config(EternalTerminal)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.1.1()(64bit) \
libcrypto.so.1.1(OPENSSL_1_1_0)(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libprotobuf-lite-3.21.12.so()(64bit) \
libsodium.so.23()(64bit) \
libssl.so.1.1()(64bit) \
libssl.so.1.1(OPENSSL_1_1_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
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
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libutempter.so.0()(64bit) \
libutempter.so.0(UTEMPTER_1.1)(64bit) \
libz.so.1()(64bit) \
systemd"

inherit rpm
