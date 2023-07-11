SUMMARY = "Tools for the Hughski Colorimeter"
DESCRIPTION = "The Hughski ColorHug colorimeter is a low cost open-source hardware \
sensor used to calibrate screens. \
 \
This package includes the client tools which allows the user to upgrade \
the firmware on the sensor or to access the sensor from command line \
scripts."
LICENSE = "GPL-2.0+"

PV = "0.2.8"

RPM_NAME = "colorhug-client-0.2.8-1.27.aarch64.rpm"
RPM_HASH = "355f280dc003c992d3a142fc8b61d088ca4b2975f725a91753ee209a7266b5e897959d41d02028117ebe6fb7eb17935a8b1402c14f0d2ed0c6fadcb6056b81ba"

RPROVIDES:${PN} += "colorhug-client"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libcolord-gtk.so.1 \
libcolord.so.2 \
libcolorhug.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgusb.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsoup-2.4.so.1"

inherit rpm
