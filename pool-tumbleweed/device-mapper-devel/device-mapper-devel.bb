SUMMARY = "Development package for the device mapper"
DESCRIPTION = "Files needed for software development using the device mapper"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16_1.02.185"

RPM_NAME = "device-mapper-devel-2.03.16_1.02.185-7.1.aarch64.rpm"
RPM_HASH = "d991b4913a893ac3cadc16d8af16c42a12f2e4c4b206038094da3c865517f6efcf744509f8748712d894e222009dd92d85120293182fe964772d0c8979dd9951"

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
