SUMMARY = "Fight Flash Fraud / Fight Fake Flash"
DESCRIPTION = "This package contains tools for identifying fake flash drives (primarily USB \
sticks and memory cards). \
 \
A fake flash drive fraudulently inflates its apparent storage capacity (far) \
beyond the physical capacity of its flash memory. Not surprisingly, using such \
a flash drive will, sooner or later, result in data loss and/or corruption. \
 \
The main tools in this package are an open-source implementation of the H2testw \
algorithm. Some extra tools are also provided, among them one for using \
the actual storage capacity of fake drives as safely as possible."
LICENSE = "GPL-3.0-only"

PV = "8.0"

RPM_NAME = "f3-8.0-1.11.aarch64.rpm"
RPM_HASH = "2ce478138b282c64ddbada05026711a8ab0ea5b1b87d18e12e93dbcb86cf03448222bedf8c34e4b9b7a7410aff604c8e68f2459b99ea975f537ab99d053427a0"

RPROVIDES:${PN} += "f3 f3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libparted.so.2()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
