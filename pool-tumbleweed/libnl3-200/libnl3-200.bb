SUMMARY = "Convenience library for working with Netlink sockets"
DESCRIPTION = "The libnl suite is a collection of libraries providing APIs to \
netlink protocol based Linux kernel interfaces."
LICENSE = "LGPL-2.1-only"

PV = "3.7.0"

RPM_NAME = "libnl3-200-3.7.0-1.5.aarch64.rpm"
RPM_HASH = "fe138af405434ce99f4bbc62469c797f166972ee0ac447d19de7d8268f1d2e12e3ddcdd87cd17313b5d5bf17a67284520762828a37a43cf3c7cc1612219c98c5"

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
