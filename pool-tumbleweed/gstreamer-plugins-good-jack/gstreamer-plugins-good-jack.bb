SUMMARY = "Jack plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the jack plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "gstreamer-plugins-good-jack-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "6ff12bfc69cd14a2f9963e1b337efd12de43a6db281828c050df331718410cf56fb977c3df4d1587dac1b9d4dd43f74439425c8cf14efc02c19fa955cfd67646"

RPROVIDES:${PN} += "gstreamer-plugins-good-jack \
gstreamer1 \
libgstjack.so"

RDEPENDS:${PN} += "gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libjack.so.0"

inherit rpm
