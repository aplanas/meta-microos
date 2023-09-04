SUMMARY = "ImageMagick file import for PFS tools"
DESCRIPTION = "This package contains input and output filters for ImageMagick to \
support pfstools's HDR graphics file format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-imgmagick-2.2.0-3.16.aarch64.rpm"
RPM_HASH = "ad4a3a41f0b8ba322aefc03ecd99a126d069c8fb53eb8ca08ee47f293623bb71f88cf9e8068a58c489fab4f080a7a447c4ec53d67f11c73c65bb56b7d10d2531"

RPROVIDES:${PN} += "pfstools-imgmagick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm
