SUMMARY = "Proxy for IIO and input subsystems"
DESCRIPTION = "This proxy reads sensor data from the IIO subsystem and serves to \
the input subsystem"
LICENSE = "GPL-3.0-only"

PV = "3.4"

RPM_NAME = "iio-sensor-proxy-3.4-2.3.aarch64.rpm"
RPM_HASH = "8c35a1e0f02096f7707bab0ac5ebeb928c1c0d8203e57e69f70c7652c4cd8d6b4e30ed52c55d8d1d0fdd2b649bde8094b5107d236ebb2025faeab36e58ad245b"

RPROVIDES:${PN} += "iio-sensor-proxy \
iio-sensor-proxy(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
systemd \
user(srvGeoClue)"

inherit rpm
