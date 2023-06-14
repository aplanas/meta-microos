SUMMARY = "Development package for the device mapper"
DESCRIPTION = "Files needed for software development using the device mapper"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16_1.02.185"

RPM_NAME = "device-mapper-devel-2.03.16_1.02.185-6.3.aarch64.rpm"
RPM_HASH = "050845901a20060680cc2f43d57b5b9a6cb719610adfd7890c807429c326c62a183844c6c3a39a58f34c5bb5848eac3b17eb6fce9aa0dbab69b0e46ffd36692f"

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
