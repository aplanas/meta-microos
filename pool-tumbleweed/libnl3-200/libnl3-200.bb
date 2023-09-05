SUMMARY = "Convenience library for working with Netlink sockets"
DESCRIPTION = "The libnl suite is a collection of libraries providing APIs to \
netlink protocol based Linux kernel interfaces."
LICENSE = "LGPL-2.1-only"

PV = "3.8.0"

RPM_NAME = "libnl3-200-3.8.0-1.1.aarch64.rpm"
RPM_HASH = "f6bebd3de4f572d5a6330e206e90d71ee0d83397083a4d8eae71daa1b4c9ec04adc56e63f6f17d91e8308d08d41a124b30b15c3accadfa5d1cae678ef4e1f3b0"

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
