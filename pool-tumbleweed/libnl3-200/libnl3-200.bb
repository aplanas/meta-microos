SUMMARY = "Convenience library for working with Netlink sockets"
DESCRIPTION = "The libnl suite is a collection of libraries providing APIs to \
netlink protocol based Linux kernel interfaces."
LICENSE = "LGPL-2.1-only"

PV = "3.7.0"

RPM_NAME = "libnl3-200-3.7.0-1.4.aarch64.rpm"
RPM_HASH = "ec057d9153e2ec309e1cfcd51fab3586ad98cfdd9149f55adf0f16f388ab376205d40a153a69aeaaba70856e490d82ca6326d6b56cbc7a36eb2897a43145d098"

RPROVIDES:${PN} += "libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-3.so.200(libnl_3_2_26)(64bit) \
libnl-3.so.200(libnl_3_2_27)(64bit) \
libnl-3.so.200(libnl_3_2_28)(64bit) \
libnl-3.so.200(libnl_3_2_29)(64bit) \
libnl-3.so.200(libnl_3_5)(64bit) \
libnl-3.so.200(libnl_3_6)(64bit) \
libnl-cli-3.so.200()(64bit) \
libnl-cli-3.so.200(libnl_3)(64bit) \
libnl-cli-3.so.200(libnl_3_2_28)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit) \
libnl-idiag-3.so.200()(64bit) \
libnl-idiag-3.so.200(libnl_3)(64bit) \
libnl-nf-3.so.200()(64bit) \
libnl-nf-3.so.200(libnl_3)(64bit) \
libnl-nf-3.so.200(libnl_3_6)(64bit) \
libnl-route-3.so.200()(64bit) \
libnl-route-3.so.200(libnl_3)(64bit) \
libnl-route-3.so.200(libnl_3_2_26)(64bit) \
libnl-route-3.so.200(libnl_3_2_27)(64bit) \
libnl-route-3.so.200(libnl_3_2_28)(64bit) \
libnl-route-3.so.200(libnl_3_2_29)(64bit) \
libnl-route-3.so.200(libnl_3_4)(64bit) \
libnl-route-3.so.200(libnl_3_5)(64bit) \
libnl-route-3.so.200(libnl_3_6)(64bit) \
libnl-route-3.so.200(libnl_3_7)(64bit) \
libnl-xfrm-3.so.200()(64bit) \
libnl-xfrm-3.so.200(libnl_3)(64bit) \
libnl-xfrm-3.so.200(libnl_3_6)(64bit) \
libnl3-200 \
libnl3-200(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnl-config"

inherit rpm
