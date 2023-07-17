SUMMARY = "Tools for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains: \
mkimage- a tool that creates kernel bootable images for U-Boot."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-tools-2023.07-1.1.aarch64.rpm"
RPM_HASH = "7f61463f3ebefa5b4d190de010da46800034f25a9352c905d979a27896e6dbd045a625559cef9ceeb0bc948ca412755e99d16025fbe6c492b390ee1fe0b2c289"

RPROVIDES:${PN} += "u-boot-tools"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
