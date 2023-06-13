SUMMARY = "Raw photo loader plugin for The GIMP"
DESCRIPTION = "UFRaw is a utility to read and manipulate raw images from digital \
cameras. It can be used as a GIMP plug-in. It reads raw images using \
Dave Coffin's raw conversion utility DCRaw, and it supports basic color \
management using Little CMS, allowing the user to apply color profiles."
LICENSE = "GPL-2.0-or-later"

PV = "0.22"

RPM_NAME = "gimp-ufraw-0.22-11.8.aarch64.rpm"
RPM_HASH = "7dd63c0eac189e0c85b9137d93e17a9692e91a282d2a55aefcd6424c57920462a77711af017847814ac857234df06049db654a91bcc8eaf9ff239deb7b834fff"

RPROVIDES:${PN} += "gimp-2.0-dcraw-plugin \
gimp-ufraw \
gimp-ufraw(aarch-64) \
rawphoto \
ufraw-gimp"

RDEPENDS:${PN} += "gimp(abi) \
gimp(api) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcfitsio.so.10()(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgegl-0.4.so.0()(64bit) \
libgimp-2.0.so.0()(64bit) \
libgimpbase-2.0.so.0()(64bit) \
libgimpui-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libgtkimageview.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2.so.2()(64bit) \
liblensfun.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
