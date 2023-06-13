SUMMARY = "Toolchain for Stitching of Images and Creating Panoramas"
DESCRIPTION = "Hugin can be used to stitch multiple images together. The resulting \
image can span 360 degrees. Another common use is the creation of very \
high resolution pictures by combining multiple images. \
 \
Other tools in this package can correct lens distortion, vignetting and \
chromatic abberation, create HDR images, provide automatic feature \
detection and extraction of key points."
LICENSE = "GPL-2.0-or-later"

PV = "2022.0.0"

RPM_NAME = "hugin-2022.0.0-1.7.aarch64.rpm"
RPM_HASH = "b619672583212b4d3f5489d5218a35a68ca0d817803efe36f1c56da21e831a497a686d31949992b154f5ebcbbdcecfbcfde0882f368c9578bbe9ff580af361f8"

RPROVIDES:${PN} += "application() \
application(PTBatcherGUI.desktop) \
application(calibrate_lens_gui.desktop) \
application(hugin.desktop) \
application(pto_gen.desktop) \
hugin \
hugin(aarch-64) \
libceleste.so.0.0()(64bit) \
libhuginbase.so.0.0()(64bit) \
libhuginbasewx.so.0.0()(64bit) \
libicpfindlib.so.0.0()(64bit) \
liblocalfeatures.so.0.0()(64bit) \
metainfo() \
metainfo(PTBatcherGUI.appdata.xml) \
metainfo(calibrate_lens_gui.appdata.xml) \
metainfo(hugin.appdata.xml) \
mimehandler(application/x-ptoptimizer-script) \
mimehandler(image/jpeg) \
mimehandler(image/tiff)"

RDEPENDS:${PN} += "enblend-enfuse \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGLEW.so.2.2()(64bit) \
libGLU.so.1()(64bit) \
libGLX.so.0()(64bit) \
libImath-3_1.so.29()(64bit) \
libOpenEXR-3_1.so.30()(64bit) \
libOpenGL.so.0()(64bit) \
libX11.so.6()(64bit) \
libblas.so.3()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexiv2.so.27()(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(GOMP_4.5)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libgomp.so.1(OMP_3.0)(64bit) \
liblapack.so.3()(64bit) \
liblcms2.so.2()(64bit) \
liblz4.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libpano13.so.3()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libvigraimpex.so.11()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_net-suse.so.9.0.0()(64bit) \
libwx_baseu_net-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_xml-suse.so.9.0.0()(64bit) \
libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_aui-suse.so.9.0.0()(64bit) \
libwx_gtk3u_aui-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_gl-suse.so.9.0.0()(64bit) \
libwx_gtk3u_gl-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_html-suse.so.9.0.0()(64bit) \
libwx_gtk3u_html-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_qa-suse.so.9.0.0()(64bit) \
libwx_gtk3u_qa-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_xrc-suse.so.9.0.0()(64bit) \
libwx_gtk3u_xrc-suse.so.9.0.0(WXU_3.2)(64bit) \
make"

inherit rpm
