SUMMARY = "Header files and documentation for libsnapper"
DESCRIPTION = "This package contains header files and documentation for developing with \
libsnapper."
LICENSE = "GPL-2.0-only"

PV = "0.10.4"

RPM_NAME = "libsnapper-devel-0.10.4-13.2.aarch64.rpm"
RPM_HASH = "315b231049ff94101424376a70cd90d236167aaa4703dd9cfcde68e572b65af1c4aeceac1b4228c3e7949174e995a1a40f17fc10cb5b520125767e8cbbcae6a7"

RPROVIDES:${PN} += "libsnapper-devel \
libsnapper-devel(aarch-64)"

RDEPENDS:${PN} += "gcc-c++ \
libacl-devel \
libboost_headers-devel \
libbtrfs-devel \
libmount-devel \
libsnapper7 \
libstdc++-devel \
libxml2-devel"

inherit rpm
