SUMMARY = "OS abstraction library for Heimdal Kerberos"
DESCRIPTION = "This package contains a library that wraps or adds utility functions \
missing from certain operating systems."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libroken18-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "d3313d57b4e1a8acc9c0e265985cc135756de846db1281f894c179c237e0114db99489e9faee0fa7549bfd2b39f1aaf97bfc6fb78306cbd745399cc2e7b935fd"

RPROVIDES:${PN} += "libroken.so.18()(64bit) \
libroken.so.18(HEIMDAL_ROKEN_1.0)(64bit) \
libroken18 \
libroken18(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit)"

inherit rpm
