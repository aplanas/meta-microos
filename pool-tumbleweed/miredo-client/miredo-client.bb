SUMMARY = "Tunneling client for IPv6 over UDP through NATs"
DESCRIPTION = "Miredo is an implementation of the 'Teredo: Tunneling IPv6 over UDP \
through NATs' proposed Internet standard (RFC4380). This offers the client \
part of miredo. Most people only need the client part."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "miredo-client-1.2.6-5.8.aarch64.rpm"
RPM_HASH = "71fc009606a46226362a825976a4ee0975ab65028e807b0d31dd3a6a5811741b80232a518c577284805c3fc24f008b6b0f1c8144bb364056e58b4c4bc1c0635a"

RPROVIDES:${PN} += "config-miredo-client \
miredo \
miredo-client"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libteredo.so.5 \
libtun6.so.0 \
miredo-common \
systemd"

inherit rpm
