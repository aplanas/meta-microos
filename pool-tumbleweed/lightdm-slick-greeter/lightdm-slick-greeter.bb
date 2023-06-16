SUMMARY = "The slick-looking login screen application"
DESCRIPTION = "The slick-looking greeter (login screen) application. \
It is implemented as a LightDM greeter."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-only"

PV = "1.6.1"

RPM_NAME = "lightdm-slick-greeter-1.6.1-1.3.aarch64.rpm"
RPM_HASH = "c61cab2df08f55ffd1221923b7d71d244211ba29339acf2039019c37d86e9468f67ee1b1985b11a8d7ff5e41e2e4203c440fb1c3d2067e68860fa0ddb3e9b5f7"

RPROVIDES:${PN} += "lightdm-greeter \
lightdm-slick-greeter"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblightdm-gobject-1.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
lightdm \
numlockx \
update-alternatives"

inherit rpm
