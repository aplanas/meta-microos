SUMMARY = "Audio File Encoder"
DESCRIPTION = "Flacon extracts individual tracks from one big audio file containing the entire \
album of music and saves them as separate audio files. To do this, it uses \
information from the appropriate CUE file. Besides, Flacon makes it possible \
to conveniently revise or specify tags both for all tracks at once or for each \
tag separately."
LICENSE = "LGPL-2.1-or-later"

PV = "10.0.0"

RPM_NAME = "flacon-10.0.0-1.3.aarch64.rpm"
RPM_HASH = "4e5b1c1fcb27861cf2c2fefcbe1d66f4bdf0e2a29d9b4587b32a76d445db9303636a9202e7f59cd943179908121f5256f6f9362b47881bd7647a8cf89ad50c14"

RPROVIDES:${PN} += "application() application(flacon.desktop) flacon flacon(aarch-64) metainfo() metainfo(com.github.Flacon.metainfo.xml) mimehandler(application/x-cue)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libtag.so.1()(64bit) libuchardet.so.0()(64bit)"

inherit rpm
