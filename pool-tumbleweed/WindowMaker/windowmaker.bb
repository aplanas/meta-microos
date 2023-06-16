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
config-WindowMaker \
libWINGs.so.3 \
libWMaker.so.1 \
libWUtil.so.5 \
libwraster.so.6 \
windowmanager \
wmaker"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libMagickWand-7.Q16HDRI.so.10 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libXmu.so.6 \
libXpm.so.4 \
libc.so.6 \
libexif.so.12 \
libfontconfig.so.1 \
libgif.so.7 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6 \
libwebp.so.7 \
wallpaper-branding-openSUSE \
xdg-menu"

inherit rpm
