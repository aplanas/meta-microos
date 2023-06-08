SUMMARY = "A fast framebuffer-based terminal emulator"
DESCRIPTION = "FbTerm is a fast terminal emulator for linux with frame buffer device. \
Features include: \
 \
  * mostly as fast as terminal of linux kernel while accelerated scrolling \
    is enabled on framebuffer device \
  * select font with fontconfig and draw text with freetype2, same as \
    Qt/Gtk+ based GUI apps \
  * dynamicly create/destroy up to 10 windows initially running default shell \
  * record scrollback history for every window \
  * auto-detect current locale and convert text encoding, support double \
    width scripts like Chinese, Japanese etc \
  * switch between configurable additional text encodings with hot keys \
    on the fly \
  * copy/past selected text between windows with mouse when gpm server is \
    running \
  * change the orientation of screen display, a.k.a. screen rotation \
  * lightweight input method framework with client-server architecture"
LICENSE = "GPL-2.0-or-later"

PV = "1.8"

RPM_NAME = "fbterm-1.8-2.8.aarch64.rpm"
RPM_HASH = "7a85de22840e2e6c9157b86a40181c8c4ffa87cfd8b1684e4b313eb974566e79c9db63fd8b292aaa3e28bbd9c97d3c747f1420202a05c3bbabd7fe598c32aa4d"

RPROVIDES:${PN} += "fbterm fbterm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit)"

inherit rpm
