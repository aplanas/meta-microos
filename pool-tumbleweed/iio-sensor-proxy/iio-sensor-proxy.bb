SUMMARY = "Proxy for IIO and input subsystems"
DESCRIPTION = "This proxy reads sensor data from the IIO subsystem and serves to \
the input subsystem"
LICENSE = "GPL-3.0-only"

PV = "3.5"

RPM_NAME = "iio-sensor-proxy-3.5-1.1.aarch64.rpm"
RPM_HASH = "2641cc01a384b1073aac97cfc6e6af97d80f8895a4027329573e5f4650fe8c41616d8be90cacc48327590b433e570738549662e0299b8391835f2566d8454ca7"

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
