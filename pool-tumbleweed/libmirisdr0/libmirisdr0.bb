SUMMARY = "SDR driver for MRi2500"
DESCRIPTION = "Library to run Mirics MRi2500 based DVB dongle as a SDR receiver."
LICENSE = "GPL-2.0"

PV = "0.0.0+git.20130608"

RPM_NAME = "libmirisdr0-0.0.0+git.20130608-1.25.aarch64.rpm"
RPM_HASH = "8d537e1aa92eb665cfb2cd70e35ee1e4bd2cb6ddc55a6a70a94cd315da0b79ba94a8424758dcc906244c21c1a60ef5b021ed3de4f423f3105a7bc6b6d5609da3"

RPROVIDES:${PN} += "libmirisdr \
libmirisdr.so.0 \
libmirisdr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
mirisdr-udev"

inherit rpm
