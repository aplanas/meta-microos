SUMMARY = "PCSC Driver for ACS CCID Based Smart Card Readers"
DESCRIPTION = "This package contains a ACS USB CCID (Chip/Smart Card Interface \
Devices) driver. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.9"

RPM_NAME = "pcsc-acsccid-1.1.9-1.1.aarch64.rpm"
RPM_HASH = "fd05c875ac3458701213120cf2f2021dbb4c2420244f34a974e456c9780943971738b489713403c49e4ff2b385cb2ece61635ad329df6da9ae34c3fbe30ea78f"

RPROVIDES:${PN} += "libacsccid.so()(64bit) \
pcsc-acsccid \
pcsc-acsccid(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libusb-1.0.so.0()(64bit) \
pcsc-lite"

inherit rpm
