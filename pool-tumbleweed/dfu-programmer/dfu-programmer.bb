SUMMARY = "A Device Firmware Update based USB programmer for Atmel chips"
DESCRIPTION = "dfu-programmer is an implementation of the Device Firmware Upgrade class \
USB driver that enables firmware upgrades for various USB enabled (with the \
correct bootloader) Atmel chips. This program was created because the \
Atmel 'FLIP' program for flashing devices does not support flashing via USB \
on Linux, and because standard DFU loaders do not work for Atmel's chips."
LICENSE = "GPL-2.0+"

PV = "0.7.2"

RPM_NAME = "dfu-programmer-0.7.2-1.28.aarch64.rpm"
RPM_HASH = "5d6034aceee8bd13c2820863d3a65477eb681b12da8ba914ab4fd769d54ca8f6c715bec75b3bbca31dd8d9b64eca83e41c330603759651ea85a97b94d24b7c3a"

RPROVIDES:${PN} += "dfu-programmer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
