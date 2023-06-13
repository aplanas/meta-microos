SUMMARY = "SDR driver for RTL2832"
DESCRIPTION = "Library to run Realtek RTL2832 based DVB dongle as a SDR receiver."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "librtlsdr0-0.6.0-2.8.aarch64.rpm"
RPM_HASH = "dfdd32e2ccf4a3a8b2f53795945e0e947e036b6e846cfb1c59d405e0921c02089138bcb8010905480532a2e2af72eedfa063894720fd8c1c49abb9f7e3f9e1b3"

RPROVIDES:${PN} += "librtlsdr.so.0()(64bit) \
librtlsdr0 \
librtlsdr0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libusb-1.0.so.0()(64bit) \
rtl-sdr-udev"

inherit rpm
