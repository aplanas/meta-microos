SUMMARY = "Cross-platform raw image processing program"
DESCRIPTION = "RawTherapee is a cross platform image processing software equipped with the essential tools for high quality and efficient RAW photo development. \
 \
 \
 \
Latest stable build from 'releases' branch."
LICENSE = "GPL-3.0-only"

PV = "5.9"

RPM_NAME = "rawtherapee-5.9-4.2.aarch64.rpm"
RPM_HASH = "7457e1871e18a16bcb71d68a9c9ba0d86ed88cbd2124cc448d5cf90682548b028c7ebc3edf41b57ad1d3d3139dbb7a3931902acb4d6f611221d5cb8d723fbd3b"

RPROVIDES:${PN} += "application() \
application(rawtherapee.desktop) \
metainfo() \
metainfo(com.rawtherapee.RawTherapee.appdata.xml) \
mimehandler(image/jpeg) \
mimehandler(image/png) \
mimehandler(image/tiff) \
mimehandler(image/x-adobe-dng) \
mimehandler(image/x-canon-cr2) \
mimehandler(image/x-canon-cr3) \
mimehandler(image/x-canon-crf) \
mimehandler(image/x-canon-crw) \
mimehandler(image/x-fuji-raf) \
mimehandler(image/x-hasselblad-3fr) \
mimehandler(image/x-hasselblad-fff) \
mimehandler(image/x-jpg) \
mimehandler(image/x-kodak-dcr) \
mimehandler(image/x-kodak-k25) \
mimehandler(image/x-kodak-kdc) \
mimehandler(image/x-leaf-mos) \
mimehandler(image/x-leica-rwl) \
mimehandler(image/x-mamiya-mef) \
mimehandler(image/x-minolta-mrw) \
mimehandler(image/x-nikon-nef) \
mimehandler(image/x-nikon-nrw) \
mimehandler(image/x-olympus-orf) \
mimehandler(image/x-panasonic-raw) \
mimehandler(image/x-panasonic-rw2) \
mimehandler(image/x-pentax-pef) \
mimehandler(image/x-pentax-raw) \
mimehandler(image/x-phaseone-iiq) \
mimehandler(image/x-raw) \
mimehandler(image/x-rwz) \
mimehandler(image/x-samsung-srw) \
mimehandler(image/x-sigma-x3f) \
mimehandler(image/x-sony-arq) \
mimehandler(image/x-sony-arw) \
mimehandler(image/x-sony-sr2) \
mimehandler(image/x-sony-srf) \
mimehandler(image/x-tif) \
mimehandler(inode/directory) \
rawtherapee \
rawtherapee(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
desktop-file-utils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairomm-1.0.so.1()(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libcanberra.so.0()(64bit) \
libexpat.so.1()(64bit) \
libfftw3f.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(GOMP_4.5)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libgtk-3.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libiptcdata.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2-2 \
liblcms2.so.2()(64bit) \
liblensfun.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpangomm-1.4.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
librsvg-2.so.2()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
