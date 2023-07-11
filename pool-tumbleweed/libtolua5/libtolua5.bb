SUMMARY = "Shared libraries for tolua"
DESCRIPTION = "This package provides shared libraries for tolua."
LICENSE = "GPL-2.0+"

PV = "5.2.4"

RPM_NAME = "libtolua5-5.2.4-4.3.aarch64.rpm"
RPM_HASH = "7d1b0461719ea3145911eb7518ca6fe9d9cb36670a9337800515d42cf568ecd01dcc45c3c041729d46f60b967d818cb5ecb4ff49994918d82e5f61a69d6f9649"

RPROVIDES:${PN} += "libtolua.so.5 \
libtolua5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
