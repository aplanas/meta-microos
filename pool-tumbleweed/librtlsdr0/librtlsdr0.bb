SUMMARY = "SDR driver for RTL2832"
DESCRIPTION = "Library to run Realtek RTL2832 based DVB dongle as a SDR receiver."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "librtlsdr0-0.6.0-2.9.aarch64.rpm"
RPM_HASH = "1d96229dea65c4134cca3f5530f63d0691fe2b8bcf1d36bad6230f3c128d5b46def374de72a31c9403ce079f7643a68a692ebd33d94ecd81f3a922f6841b2320"

RPROVIDES:${PN} += "librtlsdr.so.0 \
librtlsdr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
rtl-sdr-udev"

inherit rpm
