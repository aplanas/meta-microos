SUMMARY = "Planets as Background Pictures or Interactive Animations"
DESCRIPTION = "Xplanet can display the earth or other planets in the background of \
your display, similar to xearth or xglobe. Additionally, it can run in \
interactive mode allowing you to rotate or zoom the planet. Also, with \
an included script, it is very easy to combine map files with current \
satellite cloud images."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "xplanet-1.3.1-4.1.aarch64.rpm"
RPM_HASH = "a0e600976f469e73ba430c7c76e339507339edfdf7e1f6a30203ac27f27d1a25f2588d4a5c4be300ab6ba1d862cf88ffff8e9c7aa68d0d8c24bb2c7361982b75"

RPROVIDES:${PN} += "xplanet \
xplanet(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXss.so.1()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgif.so.7()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libnetpbm.so.11()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit)"

inherit rpm
