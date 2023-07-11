SUMMARY = "Development files for liballegro_image"
DESCRIPTION = "Development files needed to build applications which use liballegro_image."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_image5_2-devel-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "1b3756c90f7f4ba9146f6a678e9ad12d3a116105c55dca7eedbfc4ee55dff0cb6860d70d8fb0aa26fe59c347b34e5060a65dac0fd63649dffad116b215ed82bb"

RPROVIDES:${PN} += "liballegro-image5-2-devel \
pkgconfig-allegro-image-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-image5-2 \
pkgconfig-allegro-5"

inherit rpm
