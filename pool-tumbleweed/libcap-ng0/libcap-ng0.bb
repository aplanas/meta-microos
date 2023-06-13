SUMMARY = "An alternate Linux/POSIX capabilities library"
DESCRIPTION = "libcap-ng is a library providing an alternate mechanism to libcap to \
inspect and set Linux process and file capabilities (modeled upon a \
withdrawn POSIX.1e draft)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libcap-ng0-0.8.3-2.1.aarch64.rpm"
RPM_HASH = "452524304d8f39d6c203e2ed12ec089c5e5eb54fa52f2ba4ff6840677dd27819fbf607c9b41f39819fd1afff2fb3ebd50871dbab8f627d1b835e64a4af19588c"

RPROVIDES:${PN} += "libcap-ng.so.0()(64bit) \
libcap-ng0 \
libcap-ng0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
