SUMMARY = "Command line utilities to directly work with Netlink"
DESCRIPTION = "Various test program with which the functionality of libnl is \
demonstrated."
LICENSE = "GPL-2.0-only"

PV = "3.7.0"

RPM_NAME = "libnl-tools-3.7.0-1.5.aarch64.rpm"
RPM_HASH = "2e01dc98cfce40a9ce1d1ff76ccd5d7eb225e5e0603752de628b9c81585c01c012b97599d87a16be961f3dd7925d96de4aebf0820140b66810e09d51b77bd77d"

RPROVIDES:${PN} += "libnl-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-cli-3.so.200 \
libnl-genl-3.so.200 \
libnl-idiag-3.so.200 \
libnl-nf-3.so.200 \
libnl-route-3.so.200"

inherit rpm
