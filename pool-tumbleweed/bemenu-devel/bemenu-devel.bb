SUMMARY = "Development files for bemenu"
DESCRIPTION = "Files required for development for Bemenu."
LICENSE = "MIT"

PV = "0.6.15"

RPM_NAME = "bemenu-devel-0.6.15-1.1.aarch64.rpm"
RPM_HASH = "9d7d0429abc774e9d54688cb898a6cd0a89e1244641e90da723e9e11182874c675e362d0feb6482c1a8efc369aec7ffbd10186a770c114f3bca0fb7f166b7aa6"

RPROVIDES:${PN} += "bemenu-devel \
bemenu-devel(aarch-64) \
pkgconfig(bemenu)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
gcc-c++ \
libbemenu0 \
pkgconfig"

inherit rpm
