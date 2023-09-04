SUMMARY = "Raw Digital Photo Decoding"
DESCRIPTION = "Command line tools for raw digital photo decoding and processing."
LICENSE = "GPL-2.0-or-later"

PV = "9.28.0"

RPM_NAME = "dcraw-9.28.0-3.1.aarch64.rpm"
RPM_HASH = "6a28dffe341a319abcba972b3150c974bd2c0023188241f4b7608971cba650e2dce567d5698d8e8d2a347a4d252bad9099b9d0c9493203a3565cf22c19eb0592"

RPROVIDES:${PN} += "dcraw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjasper.so.7 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6"

inherit rpm
