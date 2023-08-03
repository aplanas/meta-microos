SUMMARY = "Development files for bemenu"
DESCRIPTION = "Files required for development for Bemenu."
LICENSE = "MIT"

PV = "0.6.15"

RPM_NAME = "bemenu-devel-0.6.15-1.2.aarch64.rpm"
RPM_HASH = "c53ead60e732f040782295dc465aff9913f0e8477639f33272300dd549369b2e29b992907c4278e7b3ac8c800d6ab3cded0246057e35f46dbf89e3a41e85cbfb"

RPROVIDES:${PN} += "bemenu-devel \
pkgconfig-bemenu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
gcc-c++ \
libbemenu0 \
pkgconfig"

inherit rpm
