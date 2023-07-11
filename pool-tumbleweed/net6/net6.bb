SUMMARY = "Network access framework for IPv4/IPv6"
DESCRIPTION = "net6 is a library which eases the development of network-based \
applications as it provides a TCP protocol abstraction for C++. It is \
portable to both the Windows and Unix-like platforms."
LICENSE = "LGPL-2.1+"

PV = "1.3.14"

RPM_NAME = "net6-1.3.14-12.27.aarch64.rpm"
RPM_HASH = "21d05a4d8c89893ef6cb820922a7954623000e0187edac96487161fac6a1a1983b36ed230844ae70f08e2fccb8830984b79f832c5c859407006d5efffebb7787"

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
