SUMMARY = "Tunneling server for IPv6 over UDP through NATs"
DESCRIPTION = "Miredo is an implementation of the 'Teredo: Tunneling IPv6 over UDP \
through NATs' proposed Internet standard (RFC4380). This offers the server \
part of miredo. Most people will need only the client part."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "miredo-server-1.2.6-5.7.aarch64.rpm"
RPM_HASH = "391d1b3fd0f27ca8f950f6fd37ec567c1236b2ed641dfe063f6e1ffc787a200682d154a7c10800bad0ba1fa2424bce128ce716bc5719b65ad10c6f91022f3019"

RPROVIDES:${PN} += "config(miredo-server) \
miredo-server \
miredo-server(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit) \
libteredo.so.5()(64bit) \
miredo-common \
systemd"

inherit rpm
