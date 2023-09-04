SUMMARY = "Development files for libwebcam"
DESCRIPTION = "Libwebcam provides a user-space library for interaction with the uvcvideo \
kernel driver. One could use this library to manipulate settings for one \
or many UVC-type webcams found attached on a single computer. \
 \
This package contains development files for libwebcam."
LICENSE = "LGPL-3.0+"

PV = "0.2.5"

RPM_NAME = "libwebcam-devel-0.2.5-3.1.aarch64.rpm"
RPM_HASH = "b9b0ba9f7b90c26dadd106382d0857d952cc36ae412ed942eb02b5843264433c6f34cab15207ab7178e84d61e195d4fe848e63521149828bbe9b40ec7fd6478b"

RPROVIDES:${PN} += "libwebcam-devel \
pkgconfig-libwebcam"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwebcam0"

inherit rpm
