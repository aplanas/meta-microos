SUMMARY = "Convenience library for working with Netlink sockets"
DESCRIPTION = "The libnl suite is a collection of libraries providing APIs to \
netlink protocol based Linux kernel interfaces."
LICENSE = "LGPL-2.1-only"

PV = "3.7.0"

RPM_NAME = "libnl3-200-3.7.0-1.4.aarch64.rpm"
RPM_HASH = "ec057d9153e2ec309e1cfcd51fab3586ad98cfdd9149f55adf0f16f388ab376205d40a153a69aeaaba70856e490d82ca6326d6b56cbc7a36eb2897a43145d098"

RPROVIDES:${PN} += "libnl-3.so.200 \
libnl-cli-3.so.200 \
libnl-genl-3.so.200 \
libnl-idiag-3.so.200 \
libnl-nf-3.so.200 \
libnl-route-3.so.200 \
libnl-xfrm-3.so.200 \
libnl3-200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-config"

inherit rpm
