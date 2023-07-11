SUMMARY = "USB interface library for J-Link -- development files"
DESCRIPTION = "Library for accessing Segger J-Link USB devices. \
 \
This sub-package contains the development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "libjaylink-devel-0.3.1-1.3.aarch64.rpm"
RPM_HASH = "60c0e124946be596f9d39c9a4b2adfaae5f302f01f4b0439a4c167c0cf638620a6987ee99b354cecb3c164c28795450a4c8c035358ceb610798f777e8f57d1fe"

RPROVIDES:${PN} += "libjaylink-devel \
pkgconfig-libjaylink"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjaylink0 \
pkgconfig-libusb-1.0"

inherit rpm
