SUMMARY = "Raw Digital Photo Decoding"
DESCRIPTION = "Command line tools for raw digital photo decoding and processing."
LICENSE = "GPL-2.0-or-later"

PV = "9.28.0"

RPM_NAME = "dcraw-9.28.0-2.8.aarch64.rpm"
RPM_HASH = "c2f3818cdcb18617dec9ea19fa8650154ee3c49ffb1435f45c46edffe550a8755be2204b762942b5fd2436096cd25d933a2aa1241f794ded79f8e2441412e6f6"

RPROVIDES:${PN} += "dcraw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjasper.so.7 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6"

inherit rpm
