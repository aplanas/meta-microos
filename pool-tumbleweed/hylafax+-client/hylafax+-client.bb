SUMMARY = "Client package for the Hylafax server"
DESCRIPTION = "This is client part of the Hylafax fax server. If the Hylafax fax \
server is already running on another machine, this package can be \
used to access the server."
LICENSE = "BSD-3-Clause"

PV = "7.0.7"

RPM_NAME = "hylafax+-client-7.0.7-1.4.aarch64.rpm"
RPM_HASH = "d8f1d39f195d623307b1163a97c0311f337bd95e437d402902e4d45c82aba083893b65a1ead999a73c4217357bd710b11c4db51701737560ec2686bb22e3fa3c"

RPROVIDES:${PN} += "config(hylafax+-client) \
hylafax+-client \
hylafax+-client(aarch-64) \
hylafax-client"
RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfaxutil.so.7.0.7()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
