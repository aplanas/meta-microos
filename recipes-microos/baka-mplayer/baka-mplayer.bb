SUMMARY = "A media player with UI using libmpv"
DESCRIPTION = "Baka MPlayer is a libmpv-based multimedia player. It supports gesture \
seeking, desktop dimming, hardware accelerated playback (vdpau, \
vaapi, vda) and Youtube playback support (and others)."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "2.0.4"

RPM_NAME = "baka-mplayer-2.0.4-5.8.aarch64.rpm"
RPM_HASH = "8a5b1d6abe32d49c8c27f784cccffe224fe53d6e297a9b7af03609f5cd5e17adce82fd2372e9b8b838f8e78cf77339fc2181aa01e1466fd3a7d7a11eeee20918"

RPROVIDES:${PN} += "application() \
application(baka-mplayer.desktop) \
baka-mplayer \
baka-mplayer(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmpv.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
