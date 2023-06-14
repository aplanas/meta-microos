SUMMARY = "Userspace library for the in-kernel Netfilter counters"
DESCRIPTION = "This library provides the programming interface (API) to the \
Netfilter extended accounting infrastructure."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "libnetfilter_acct1-1.0.3-2.10.aarch64.rpm"
RPM_HASH = "0356826ab71982e939692922810bc564fd2f183f37a854865ce2e5091fb4963a5bf5ec665e6fc420e9f8338962a29a67e58e5541843604fa28a662c1fff309c8"

RPROVIDES:${PN} += "libnetfilter-acct.so.1 \
libnetfilter-acct1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0"

inherit rpm
