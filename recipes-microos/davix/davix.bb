SUMMARY = "File management over HTTP-based protocols"
DESCRIPTION = "Davix does file management over HTTP-based protocols. It focuses on \
remote I/O and data management of large collections of files. There \
is support for the WebDav, Amazon S3, Microsoft Azure, and HTTP \
protocols. \
 \
It provides a C++ library offering an HTTP API, a remote I/O API, and \
a POSIX compatibility layer. It also provides several utilities for \
file transfer, large collections of files management and large files \
management."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.4"

RPM_NAME = "davix-0.8.4-1.3.aarch64.rpm"
RPM_HASH = "10286a0e407f9589f5c905b849268d389a57e13d669b37dad1e7cee4b71bdd46f0f098907adbe930542dec5ba2b70460fac10d001f880fe0558004744b244cc4"

RPROVIDES:${PN} += "davix \
davix(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdavix.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
