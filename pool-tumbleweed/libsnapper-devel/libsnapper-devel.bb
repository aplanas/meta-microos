SUMMARY = "Header files and documentation for libsnapper"
DESCRIPTION = "This package contains header files and documentation for developing with \
libsnapper."
LICENSE = "GPL-2.0-only"

PV = "0.10.5"

RPM_NAME = "libsnapper-devel-0.10.5-2.1.aarch64.rpm"
RPM_HASH = "f69585d3e0fe8b2bf81e94a6679c472098c9ad9af374157bb4a996ba659328fa65c6ae3b57855189a76b3bf97c16db4836aec5a8e23560d1f5fbf248adf62001"

RPROVIDES:${PN} += "libsnapper-devel"

RDEPENDS:${PN} += "gcc-c++ \
libacl-devel \
libboost-headers-devel \
libbtrfs-devel \
libmount-devel \
libsnapper7 \
libstdc++-devel \
libxml2-devel"

inherit rpm
