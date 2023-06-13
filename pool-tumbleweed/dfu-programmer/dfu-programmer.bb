SUMMARY = "A Device Firmware Update based USB programmer for Atmel chips"
DESCRIPTION = "dfu-programmer is an implementation of the Device Firmware Upgrade class \
USB driver that enables firmware upgrades for various USB enabled (with the \
correct bootloader) Atmel chips. This program was created because the \
Atmel 'FLIP' program for flashing devices does not support flashing via USB \
on Linux, and because standard DFU loaders do not work for Atmel's chips."
LICENSE = "GPL-2.0+"

PV = "0.7.2"

RPM_NAME = "dfu-programmer-0.7.2-1.27.aarch64.rpm"
RPM_HASH = "22001874c730f3b8e18807579f626b7c8d0afab47edbac886bea1872a172996fe586dd09feed597c4a9f85eb07294e9b85c28ef1f2a8b8bb868b01e5359beb6c"

RPROVIDES:${PN} += "dfu-programmer \
dfu-programmer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
