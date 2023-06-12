SUMMARY = "Automatic de-skew and bounding box determination for scanned page images"
DESCRIPTION = "This program determines the skew angle for text, and works with black/white \
images in TIFF or PBM format. To achieve this, it uses an original \
algorithm based on a fast implementation of the Radon transform. This \
program is part of the Page Layout Detection Tools project, which aims to \
automate the layout detection in scanned page images."
LICENSE = "GPL-2.0-or-later"

PV = "0.1"

RPM_NAME = "pagetools-0.1-2.14.aarch64.rpm"
RPM_HASH = "a020eb1d08026ef4e750b7519ee883b432b2f55e9633d629d43639af38190de02277f2c728d400337fe002008df6302ac94c7d920a1594f1c1fbd84843934f14"

RPROVIDES:${PN} += "pagetools \
pagetools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libnetpbm.so.11()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
