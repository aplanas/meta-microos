SUMMARY = "Library offering davix APIs for HTTP, remote I/O, and POSIX compatibility layer"
DESCRIPTION = "This package provides the shared libraries for davix with APIs for \
HTTP, remote I/O, and a POSIX compatibility layer."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.4"

RPM_NAME = "libdavix0-0.8.4-1.3.aarch64.rpm"
RPM_HASH = "b1d693d8dff54aa5edd4051afa4e1bccfe5de4e97a4a4473f9748df26e8d10df8e1b7bfdf76a1e221a8e9732dff76a79ac5dd72050bd373ceae1cc1d8bb6af86"

RPROVIDES:${PN} += "libdavix.so.0()(64bit) \
libdavix0 \
libdavix0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libuuid.so.1()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
