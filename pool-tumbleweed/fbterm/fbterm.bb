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

RPM_NAME = "fbterm-1.8-2.9.aarch64.rpm"
RPM_HASH = "c639896ab632b1fb2afd9f23acfe127acaa900176b424c03e0322c79d7784d779a619cfe4aa87d4309cca46e6ce272010da441cd7d7c21ad7f4626ed6d9d6951"

RPROVIDES:${PN} += "fbterm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libstdc++.so.6"

inherit rpm
