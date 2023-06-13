SUMMARY = "Command line utilities to directly work with Netlink"
DESCRIPTION = "Various test program with which the functionality of libnl is \
demonstrated."
LICENSE = "GPL-2.0-only"

PV = "3.7.0"

RPM_NAME = "libnl-tools-3.7.0-1.4.aarch64.rpm"
RPM_HASH = "2816f2fe3d74fc5f268beff831c21fe308f46c6c5b4e3ecc3cda0c53fb7465a7625931dabd021ad1fd59fa3bc9d4f223b78aa146c78fcfa126f9e2a0a1d81ce5"

RPROVIDES:${PN} += "libnl-tools \
libnl-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-cli-3.so.200()(64bit) \
libnl-cli-3.so.200(libnl_3)(64bit) \
libnl-cli-3.so.200(libnl_3_2_28)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit) \
libnl-idiag-3.so.200()(64bit) \
libnl-idiag-3.so.200(libnl_3)(64bit) \
libnl-nf-3.so.200()(64bit) \
libnl-nf-3.so.200(libnl_3)(64bit) \
libnl-route-3.so.200()(64bit) \
libnl-route-3.so.200(libnl_3)(64bit) \
libnl-route-3.so.200(libnl_3_2_28)(64bit)"

inherit rpm
