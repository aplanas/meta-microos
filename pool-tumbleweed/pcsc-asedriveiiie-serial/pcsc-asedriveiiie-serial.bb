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

RPROVIDES:${PN} += "libASESerial.so()(64bit) \
pcsc-asedriveiiie-serial \
pcsc-asedriveiiie-serial(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
pcsc-lite"

inherit rpm
