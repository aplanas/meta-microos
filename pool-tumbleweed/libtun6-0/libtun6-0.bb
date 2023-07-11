SUMMARY = "Linux tunnel configuration library used by miredo"
DESCRIPTION = "Miredo is an implementation of the 'Teredo: Tunneling IPv6 over UDP \
through NATs' proposed Internet standard (RFC4380). \
This package contains a library that takes care of configuring \
Linux tunnel interfaces."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "libtun6-0-1.2.6-5.8.aarch64.rpm"
RPM_HASH = "7da16e358d377b2cb55d1ace21bd20ac53e19afbf0d6723e17155288f59fdb29010ebf885eaf6c9f5dfa943610b408992d963850c91cc113d1debe41abc7cb4f"

RPROVIDES:${PN} += "libtun6-0 \
libtun6.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
