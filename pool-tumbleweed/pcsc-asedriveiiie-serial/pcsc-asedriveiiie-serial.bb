SUMMARY = "ASEDrive IIIe Serial Smartcard Reader Driver"
DESCRIPTION = "This package contains a driver for the ASEDrive IIIe Serial smart card \
reader. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "BSD-3-Clause"

PV = "3.7"

RPM_NAME = "pcsc-asedriveiiie-serial-3.7-7.28.aarch64.rpm"
RPM_HASH = "0ff57ac977d9477e0b2947f1a5f3ca19134d4d1e4b784c594af864f28d84d7f35b3a851e9ea01c86ba7732ebe7519fd95ca4d959a31d75f5fb397baf2d311b3f"

RPROVIDES:${PN} += "libASESerial.so \
pcsc-asedriveiiie-serial"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pcsc-lite"

inherit rpm
