SUMMARY = "Network access framework for IPv4/IPv6"
DESCRIPTION = "net6 is a library which eases the development of network-based \
applications as it provides a TCP protocol abstraction for C++. It is \
portable to both the Windows and Unix-like platforms."
LICENSE = "LGPL-2.1+"

PV = "1.3.14"

RPM_NAME = "net6-1.3.14-12.26.aarch64.rpm"
RPM_HASH = "8a3b125e5213bae61682d4ad7d88038d583ee08070ba49875a60bca0f2c4611b5c3c94ebb60c951d4d547746f3ae0f2104177bd5152fe8e2ce61c7b76db75e67"

RPROVIDES:${PN} += "libnet6-1.3.so.0 \
net6"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
net6-lang"

inherit rpm
