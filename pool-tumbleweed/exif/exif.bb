SUMMARY = "Small Command Line Utility to Show and Change EXIF Information in JPEG Files"
DESCRIPTION = "Exif is a small command line utility to show and change EXIF \
information hidden in JPEG files. It demonstrate the power of libexif \
library."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.22"

RPM_NAME = "exif-0.6.22-2.11.aarch64.rpm"
RPM_HASH = "df54ac04fa6bf76e5f760e032ac5f79b09c663e702e3e762216141a8403a9eada1d474e159a45d1da0375670c9c5836b1c11fc14935e08cb05edb174470de298"

RPROVIDES:${PN} += "exif \
exif(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexif.so.12()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit)"

inherit rpm
