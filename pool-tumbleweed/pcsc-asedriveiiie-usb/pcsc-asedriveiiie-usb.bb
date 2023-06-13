SUMMARY = "ASEDrive IIIe USB Smart Card Reader Driver"
DESCRIPTION = "This package contains a driver for the ASEDrive IIIe USB smart card \
reader. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "BSD-3-Clause"

PV = "3.7"

RPM_NAME = "pcsc-asedriveiiie-usb-3.7-11.12.aarch64.rpm"
RPM_HASH = "5ab0c4ecaaf123a4966536baa188083cd1934ae779a05000a2e7559974c3c345314b49872b2da7c89ba2fc47234f076aff5949ff81188699493835723b510190"

RPROVIDES:${PN} += "libASEDriveIIIe-USB.so()(64bit) \
pcsc-asedriveiiie-usb \
pcsc-asedriveiiie-usb(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libusb-0.1.so.4()(64bit) \
pcsc-lite"

inherit rpm
