SUMMARY = "Development files for the libbd_kbd plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_kbd plugin/library.."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_kbd-devel-2.28-1.6.aarch64.rpm"
RPM_HASH = "09999f27f806f92c6fbe4d39023a2eb1d9bd6561b01c67e24727d70f062a35fd346983ac818e74350986baca8aac8a303591570ede630c4410e7ba15937ca940"

RPROVIDES:${PN} += "libbd-kbd-devel \
libblockdev-kbd-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-kbd2 \
libbd-utils-devel"

inherit rpm
