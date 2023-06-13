SUMMARY = "Upload tool for AVR microcontrollers"
DESCRIPTION = "avrdude is a tool for AVR microcontrollers and drives many hardware \
in-system programmers. avrdude allows programming microcontrollers \
through a USB or parallel port of the computer."
LICENSE = "GPL-2.0+"

PV = "6.3"

RPM_NAME = "avrdude-6.3-5.7.aarch64.rpm"
RPM_HASH = "7d3d52970beef39c33600fab7a71f40421bf1a17b00d60ad5d32b66451293c912368a584c85324ffa2eee41285bf544fb3e52daa0f310b5b0f92fea7cff3c111"

RPROVIDES:${PN} += "avr-programmer \
avrdude \
avrdude(aarch-64) \
config(avrdude)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/modprobe \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libelf.so.1()(64bit) \
libftdi1.so.2()(64bit) \
libm.so.6()(64bit) \
libreadline.so.8()(64bit) \
libusb-0.1.so.4()(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
