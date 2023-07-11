SUMMARY = "The slick-looking login screen application"
DESCRIPTION = "The slick-looking greeter (login screen) application. \
It is implemented as a LightDM greeter."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-only"

PV = "1.6.1"

RPM_NAME = "lightdm-slick-greeter-1.6.1-1.4.aarch64.rpm"
RPM_HASH = "a29554191c883de4b0e714ee4e341aca027275cbd5f291e3b58ea33808b1e73b4c6eff448a91cab3262fac28c0b978e52570c21361c5cdac35bf2ea2257dbfb4"

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
