SUMMARY = "Development files for the nftables command line interface"
DESCRIPTION = "libnftables is the nftables command line interface placed into a \
library. \
 \
This package contains the header files for the library."
LICENSE = "GPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "nftables-devel-1.0.7-1.7.aarch64.rpm"
RPM_HASH = "8dfb976d08a8956e0e9dd88f30357d0472b4e86a727062c9af7fb195cfaad2685b431b79240c0e66b5f89cf5902761e0febb984742635117a31879e67a66cd7c"

RPROVIDES:${PN} += "nftables-devel \
pkgconfig-libnftables"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnftables1"

inherit rpm
