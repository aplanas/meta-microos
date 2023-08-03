SUMMARY = "Development files for the nftables command line interface"
DESCRIPTION = "libnftables is the nftables command line interface placed into a \
library. \
 \
This package contains the header files for the library."
LICENSE = "GPL-2.0-only"

PV = "1.0.8"

RPM_NAME = "nftables-devel-1.0.8-1.1.aarch64.rpm"
RPM_HASH = "2d3491538f3cdefdd3438af66464846d5e2e6fca281c7b5df1760b303e58a61861055f743d0b32d9b159ea27fb665bc7343daec84086bb13e3180488f327548f"

RPROVIDES:${PN} += "nftables-devel \
pkgconfig-libnftables"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnftables1"

inherit rpm
