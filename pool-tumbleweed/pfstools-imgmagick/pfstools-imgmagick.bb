SUMMARY = "ImageMagick file import for PFS tools"
DESCRIPTION = "This package contains input and output filters for ImageMagick to \
support pfstools's HDR graphics file format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-imgmagick-2.2.0-3.15.aarch64.rpm"
RPM_HASH = "a6205dc3270d7b25bae93cb3e4f3e433bc259714546ba568fdaddf427fbd581d1f1210b19bef9d98666a111a925aca04f622c4313383ea9d7580fde45a60d61c"

RPROVIDES:${PN} += "pfstools-imgmagick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm
