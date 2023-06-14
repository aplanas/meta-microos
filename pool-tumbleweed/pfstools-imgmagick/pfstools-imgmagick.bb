SUMMARY = "ImageMagick file import for PFS tools"
DESCRIPTION = "This package contains input and output filters for ImageMagick to \
support pfstools's HDR graphics file format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-imgmagick-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "f3a76af0dbaee48c9a58356b6dadc6eb16c83781aed38a1b330e0d82cc3ae60cbb2e96adfc243ede05049ad38f47f29088103d26d1be65ace265d160c0f7d696"

RPROVIDES:${PN} += "pfstools-imgmagick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm
