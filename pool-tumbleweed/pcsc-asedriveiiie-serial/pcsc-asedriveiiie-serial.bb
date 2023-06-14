SUMMARY = "ASEDrive IIIe Serial Smartcard Reader Driver"
DESCRIPTION = "This package contains a driver for the ASEDrive IIIe Serial smart card \
reader. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "BSD-3-Clause"

PV = "3.7"

RPM_NAME = "pcsc-asedriveiiie-serial-3.7-7.27.aarch64.rpm"
RPM_HASH = "ddd57759a08c2613491e697c7b610acebe9ec84b8fe29b761012828d78ac01841922598f984dca950bf1c5a90288479aa0987b75601f49ba245ec30fde26028d"

RPROVIDES:${PN} += "libASESerial.so \
pcsc-asedriveiiie-serial"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pcsc-lite"

inherit rpm
