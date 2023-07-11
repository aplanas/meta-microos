SUMMARY = "Tunneling server for IPv6 over UDP through NATs"
DESCRIPTION = "Miredo is an implementation of the 'Teredo: Tunneling IPv6 over UDP \
through NATs' proposed Internet standard (RFC4380). This offers the server \
part of miredo. Most people will need only the client part."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "miredo-server-1.2.6-5.8.aarch64.rpm"
RPM_HASH = "a59a24f0d92740f1ab3b66a572b31eb8ce211533676c072b2eebc19c77f2f9e3301ffebd14679e476ac8e78a91ec4ecdc368adc3ec468d78d8d8809db1988993"

RPROVIDES:${PN} += "config-miredo-server \
miredo-server"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libteredo.so.5 \
miredo-common \
systemd"

inherit rpm
