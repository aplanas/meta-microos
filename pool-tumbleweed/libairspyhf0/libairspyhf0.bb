SUMMARY = "Driver for Airspy HF+"
DESCRIPTION = "Library to run Airspy HF+ SDR receiver."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "libairspyhf0-1.6.8-1.13.aarch64.rpm"
RPM_HASH = "980c3b9318cbf6bde16c6ad164ece66853ad8d08c00aa4d3452906b57392dff387a66a335cfa17bd5aff1bbf9757c8d7b1319c1b61cdddf721feba974dc3eb3c"

RPROVIDES:${PN} += "libairspyhf.so.0 \
libairspyhf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
airspyhf-udev \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libusb-1.0.so.0"

inherit rpm
