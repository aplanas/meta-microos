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

RPM_NAME = "miredo-common-1.2.6-5.7.aarch64.rpm"
RPM_HASH = "f10d1de84bf9ccce69b95a9cbc662da92609e10059767c8a595bef9ac5d46dcc95e6c8248d8cf67dc30912bc85e835eb2049203c7abbee0e1f2334b15c27880c"

RPROVIDES:${PN} += "miredo-common \
miredo-libs"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libteredo.so.5 \
shadow"

inherit rpm
