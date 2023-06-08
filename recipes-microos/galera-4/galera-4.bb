SUMMARY = "Galera: a synchronous multi-master wsrep provider (replication engine)"
DESCRIPTION = "Galera is a fast synchronous multimaster wsrep provider (replication engine) \
for transactional databases and similar applications. For more information \
about wsrep API see http://launchpad.net/wsrep. For a description of Galera \
replication engine see http://www.codership.com. \
 \
Copyright 2007-2015 Codership Oy. All rights reserved. Use is subject to license terms under GPLv2 license. \
 \
This software comes with ABSOLUTELY NO WARRANTY. This is free software, \
and you are welcome to modify and redistribute it under the GPLv2 license."
LICENSE = "GPL-2.0-only"

PV = "26.4.14"

RPM_NAME = "galera-4-26.4.14-1.1.aarch64.rpm"
RPM_HASH = "bca095b1403296df52885acacfe966cbe3338f3136388ba0e1650b2643247b30a998dea04d1fc61919777dd8015e7816ad4a49e3e606576c1abfef21dfd48336"

RPROVIDES:${PN} += "config(galera-4) galera-4 galera-4(aarch-64) group(garb) user(garb)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/touch fillup galera-4-wsrep-provider ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_program_options.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) sysuser-shadow"

inherit rpm
