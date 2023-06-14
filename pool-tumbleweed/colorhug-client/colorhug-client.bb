SUMMARY = "Tools for the Hughski Colorimeter"
DESCRIPTION = "The Hughski ColorHug colorimeter is a low cost open-source hardware \
sensor used to calibrate screens. \
 \
This package includes the client tools which allows the user to upgrade \
the firmware on the sensor or to access the sensor from command line \
scripts."
LICENSE = "GPL-2.0+"

PV = "0.2.8"

RPM_NAME = "colorhug-client-0.2.8-1.26.aarch64.rpm"
RPM_HASH = "8118e7dcbb8df7d1f35e4e876bfdce5e0a4eef387d2289dd15cf2c0a8b7bc56f62053279cbddfae8f134cfa469b713e2a10b2cbaedfa17ba0def8b11091bd7a4"

RPROVIDES:${PN} += "colorhug-client"

RDEPENDS:${PN} += "/bin/sh \
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
