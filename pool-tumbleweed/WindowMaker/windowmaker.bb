SUMMARY = "A Colorful and Flexible Window Manager"
DESCRIPTION = "Window Maker is an X11 window manager originally designed to provide \
integration support for the GNUstep Desktop Environment. In every way \
possible, it reproduces the elegant look and feel of the NEXTSTEP user \
interface. It is fast, feature rich, easy to configure, and easy to \
use. It is also free software, with contributions being made by \
programmers from around the world. \
 \
Window Maker has a stable user interface since many years and comes \
with a powerful GUI configuration editor called WPrefs, which removes \
the need to edit text-based config files by hand. It supports running \
dockapps which make everyday tasks such as monitoring system \
performance and battery usage, mounting devices or connecting to the \
internet very easy. Please see the features section for more specifics \
on what Window Maker can do, and how it compares with other popular \
window managers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "0.95.9"

RPM_NAME = "WindowMaker-0.95.9-2.10.aarch64.rpm"
RPM_HASH = "285c76ef3605dadef449b547f96161c8fc9322ca9e902642ca314486bccd56eea56fc341d63359352810a2668622879d16790960ddfca27d144a950a11cb1e68"

RPROVIDES:${PN} += "WindowMaker \
WindowMaker(aarch-64) \
config(WindowMaker) \
libWINGs.so.3()(64bit) \
libWMaker.so.1()(64bit) \
libWUtil.so.5()(64bit) \
libwraster.so.6()(64bit) \
libwraster.so.6(LIBWRASTER6)(64bit) \
windowmanager \
wmaker"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libMagickWand-7.Q16HDRI.so.10()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXft.so.2()(64bit) \
libXinerama.so.1()(64bit) \
libXmu.so.6()(64bit) \
libXpm.so.4()(64bit) \
libc.so.6()(64bit) \
libexif.so.12()(64bit) \
libfontconfig.so.1()(64bit) \
libgif.so.7()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libtiff.so.6()(64bit) \
libwebp.so.7()(64bit) \
wallpaper-branding-openSUSE \
xdg-menu"

inherit rpm
