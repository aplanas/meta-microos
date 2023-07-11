SUMMARY = "Proxy for IIO and input subsystems"
DESCRIPTION = "This proxy reads sensor data from the IIO subsystem and serves to \
the input subsystem"
LICENSE = "GPL-3.0-only"

PV = "3.4"

RPM_NAME = "iio-sensor-proxy-3.4-2.4.aarch64.rpm"
RPM_HASH = "5c5b704d98c241ee00b3ba35ea6737bf65eee211ea6e64594186a885a7b1fa9b88009ca17da4ffcffc8aee50cfdd02377621fa1591c6da4c97b7434bb8d10890"

RPROVIDES:${PN} += "iio-sensor-proxy"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libm.so.6 \
libpolkit-gobject-1.so.0 \
systemd \
user-srvGeoClue"

inherit rpm
