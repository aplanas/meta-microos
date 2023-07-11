SUMMARY = "Runtime libraries for miredo"
DESCRIPTION = "Miredo is an implementation of the 'Teredo: Tunneling IPv6 over UDP \
through NATs' proposed Internet standard (RFC4380). It can serve \
either as a Teredo client, a stand-alone Teredo relay, or a Teredo \
server, please install the miredo-server or miredo-client appropriately. \
It is meant to provide IPv6 connectivity to hosts behind NAT \
devices, most of which do not support IPv6, and not even \
IPv6-over-IPv4 (including 6to4). \
This common package provides the files necessary for both server and client."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "miredo-common-1.2.6-5.8.aarch64.rpm"
RPM_HASH = "6338d5ff9e9cde46e76a130d2ac6ad25d7f283597234f7d0a03112f729e444a0a10800a1214c14c77009659922236005eb9ecd1eb505cc2e3d56fc52af3c5fec"

RPROVIDES:${PN} += "miredo-common \
miredo-libs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libteredo.so.5 \
shadow"

inherit rpm
