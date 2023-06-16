SUMMARY = "Japanese Fixed Fonts for the X Window System"
DESCRIPTION = "This Package contains Japanese fixed-width fonts for X11. \
 \
It contains the fonts knj10, kaname-alter, shinonome12, shinonome16, \
k14goth, Kappa20, kanji32, and marumoji. \
 \
On top of that, it also contains bold, italic, and bold-italic versions \
of the popular Japanese fonts usually found in the \
/usr/lib/X11/fonts/misc directory of the standard X11 distribution and \
bold, italic, and bold-italic versions of iso-8859-1 fonts which fit \
nicely in style and width to the Japanese fonts."
LICENSE = "SUSE-Public-Domain & HPND"

PV = "20020904"

RPM_NAME = "x11-japanese-bitmap-fonts-20020904-654.14.noarch.rpm"
RPM_HASH = "449b9b0b4d70c363ca722ed676d26590b6f3607a17bab620bd8fd82b43a260009aa0846b7e375137ed56137931bda0a46571c940f8bf67a0ebe3dc3b4650732d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xorg-x11-ja \
x11-japanese-bitmap-fonts \
xfntjp"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
