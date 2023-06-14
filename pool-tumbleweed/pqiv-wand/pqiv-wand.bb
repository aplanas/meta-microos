SUMMARY = "Backend wand for pqiv"
DESCRIPTION = "Backend wand for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "pqiv-wand-2.12-1.4.aarch64.rpm"
RPM_HASH = "35db78b78b10bff14c405f56602a11de3c1bedddb90521091e55cd0df01ff401e8df6b0b02b35a39cff46b71d329ac68bcf2f6214f29aa42877fa5fa2133c2ce"

RPROVIDES:${PN} += "pqiv-wand"

RDEPENDS:${PN} += "libMagickWand-7.Q16HDRI.so.10 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgtk-3.so.0 \
pqiv"

inherit rpm
