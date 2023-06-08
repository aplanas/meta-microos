SUMMARY = "Batch Image Conversion Tool"
DESCRIPTION = "Converseen is a batch image conversion tool. Converseen allows you \
to convert images in more than 100 different formats. \
 \
With converseen you can: \
- Carry out a single or a multiple conversion. \
- Resize one or more images. \
- Compress images for your web pages. \
- Rotate and flip images. \
- Rename a bunch of images using a progressive number or a prefix/suffix. \
- Selecting a resampling filter to resize images."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.11.1"

RPM_NAME = "converseen-0.9.11.1-1.1.aarch64.rpm"
RPM_HASH = "bef3414c00695a57ae6d64ad0b7abf58b9d48c117c53fec1c687b267ea16bd7a6841c077a622fa0c64a24d0cbf77abffeb23c77b4ed1c18613a0d177fa1b5974"

RPROVIDES:${PN} += "application() application(net.fasterland.converseen.desktop) converseen converseen(aarch-64) metainfo() metainfo(converseen.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libMagick++-7.Q16HDRI.so.5()(64bit) libMagickCore-7.Q16HDRI.so.10()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
