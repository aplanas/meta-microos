SUMMARY = "Library for image processing and image analysis applications"
DESCRIPTION = "Library for efficient image processing and image analysis operations."
LICENSE = "BSD-2-Clause"

PV = "1.83.1"

RPM_NAME = "libleptonica6-1.83.1-1.3.aarch64.rpm"
RPM_HASH = "0ee530f284bdfadd298743601366b562b6b9e81eff179193ed34a1ad2c74a516b26924a0e132baee6253af540c70fa480902efb85e486122a0454921ec3e0d28"

RPROVIDES:${PN} += "liblept \
libleptonica.so.6 \
libleptonica6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgif.so.7 \
libjpeg.so.8 \
libm.so.6 \
libopenjp2.so.7 \
libpng16.so.16 \
libtiff.so.6 \
libwebp.so.7 \
libwebpmux.so.3 \
libz.so.1"

inherit rpm
