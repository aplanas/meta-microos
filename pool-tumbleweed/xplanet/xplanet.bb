SUMMARY = "Planets as Background Pictures or Interactive Animations"
DESCRIPTION = "Xplanet can display the earth or other planets in the background of \
your display, similar to xearth or xglobe. Additionally, it can run in \
interactive mode allowing you to rotate or zoom the planet. Also, with \
an included script, it is very easy to combine map files with current \
satellite cloud images."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "xplanet-1.3.1-4.2.aarch64.rpm"
RPM_HASH = "2bf0589b63ebe1053901d83ee68a98b4cd80292b0e42ce79de52e3e6b99a9d6c7a8cbd4c0083e76a7831400780d61b1535c417f228518cedfd0c6d8ef0f623a0"

RPROVIDES:${PN} += "xplanet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXss.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libnetpbm.so.11 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
