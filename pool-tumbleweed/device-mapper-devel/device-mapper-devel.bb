SUMMARY = "Development package for the device mapper"
DESCRIPTION = "Files needed for software development using the device mapper"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16_1.02.185"

RPM_NAME = "device-mapper-devel-2.03.16_1.02.185-8.1.aarch64.rpm"
RPM_HASH = "88aa22fe28a1e410ff9210962771ffad7257a0bf9305ae22750c77b6da3a3c03844feed6e181d5d4516994c3437423b064242cccd00adf7f31c074371a405f69"

RPROVIDES:${PN} += "device-mapper-devel \
pkgconfig-devmapper \
pkgconfig-devmapper-event"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
device-mapper \
libdevmapper-event1-03 \
libdevmapper1-03 \
pkgconfig-libselinux \
pkgconfig-libudev"

inherit rpm
