SUMMARY = "Tunneling client for IPv6 over UDP through NATs"
DESCRIPTION = "Miredo is an implementation of the 'Teredo: Tunneling IPv6 over UDP \
through NATs' proposed Internet standard (RFC4380). This offers the client \
part of miredo. Most people only need the client part."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "miredo-client-1.2.6-5.7.aarch64.rpm"
RPM_HASH = "f522b0abedf013519198db986a2e20c1f1c4d488bb523ac1f2fc6c3dc8eb7d92e33ca046f1f91a06e0ff5ae3236549ee11f82f67ceb77f6b346aaedb46d5428a"

RPROVIDES:${PN} += "config(miredo-client) \
miredo \
miredo-client \
miredo-client(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit) \
libteredo.so.5()(64bit) \
libtun6.so.0()(64bit) \
miredo-common \
systemd"

inherit rpm
