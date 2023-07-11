SUMMARY = "Development files for libwebcam"
DESCRIPTION = "Libwebcam provides a user-space library for interaction with the uvcvideo \
kernel driver. One could use this library to manipulate settings for one \
or many UVC-type webcams found attached on a single computer. \
 \
This package contains development files for libwebcam."
LICENSE = "LGPL-3.0+"

PV = "0.2.5"

RPM_NAME = "libwebcam-devel-0.2.5-2.13.aarch64.rpm"
RPM_HASH = "d46599c929f11639401f0fe6278d047c2fac017c44fb6a51a61176f78fe0967e71075f963ba90c43bbe9538371b35898b6139282da9828b93cdc4e4036a199c7"

RPROVIDES:${PN} += "libwebcam-devel \
pkgconfig-libwebcam"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwebcam0"

inherit rpm
