SUMMARY = "Rawtherapee fork with masks and simplified UI"
DESCRIPTION = "A free, open-source, cross-platform raw image processing program. ART is a derivative of the popular RawTherapee, trading a bit of customization and control over various processing parameters for a simpler and (hopefully) easier to use interface, while still maintaining the power and quality of RawTherapee."
LICENSE = "GPL-3.0-only"

PV = "1.20"

RPM_NAME = "ART-1.20-1.1.aarch64.rpm"
RPM_HASH = "b98d54b050b4f611aa307b7b7eeda5849686362f7dd03c65a4dd95ca380eb8c0930f267cddc4b9cf86a8d21d1079d55c3929571f93b57027cf77ab0c4cd4dd3f"

RPROVIDES:${PN} += "ART \
ART(aarch-64) \
application() \
application(ART.desktop) \
librtengine.so()(64bit) \
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
mimehandler(inode/directory)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairomm-1.0.so.1()(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libcanberra.so.0()(64bit) \
libexiv2.so.27()(64bit) \
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
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2.so.2()(64bit) \
liblensfun.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libmimalloc.so.2()(64bit) \
libpangomm-1.4.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libraw_r.so.23()(64bit) \
librsvg-2.so.2()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
