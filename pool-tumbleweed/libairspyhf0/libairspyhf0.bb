SUMMARY = "Driver for Airspy HF+"
DESCRIPTION = "Library to run Airspy HF+ SDR receiver."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "libairspyhf0-1.6.8-1.12.aarch64.rpm"
RPM_HASH = "37000145eb193a1676bc122adc3ab3554f1dea7386880bc1c20fcdcc7cb3baf01faaf20b1b0e130f4a9bcde8466a9651b7fe2570bd8aa98b17eb093750224d6e"

RPROVIDES:${PN} += "libairspyhf.so.0 \
libairspyhf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
airspyhf-udev \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libusb-1.0.so.0"

inherit rpm
