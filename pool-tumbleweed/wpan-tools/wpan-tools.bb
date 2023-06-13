SUMMARY = "Utilities to manage the Linux 802.15.4 WPAN stack"
DESCRIPTION = "This is a set of utils to manage the Linux WPAN stack, \
compatible with IEEE 802.15.4-2003 (and to a lesser extent, \
2006)."
LICENSE = "ISC"

PV = "0.9"

RPM_NAME = "wpan-tools-0.9-1.13.aarch64.rpm"
RPM_HASH = "372a13f188bc445443b7b1126a0f9daf4fb15ebdff166f3d9024c4e77458a0079304ffcdb6e04a42569a2b91bdaadbdfdcfa7fc54418cada4eaa5d53f41508d3"

RPROVIDES:${PN} += "wpan-tools \
wpan-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-3.so.200(libnl_3_2_27)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit)"

inherit rpm
