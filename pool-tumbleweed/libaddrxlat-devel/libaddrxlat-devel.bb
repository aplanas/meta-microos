SUMMARY = "Include files and libraries for libaddrxlat development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libaddrxlat."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.1+git3.g97c716a"

RPM_NAME = "libaddrxlat-devel-0.5.1+git3.g97c716a-3.2.aarch64.rpm"
RPM_HASH = "3383f7d5ff8751e5c3578f4e31cbff340d73f8fc08e0ac10851f59b595922673a573b4ed618a2f960cf062c1c934137f53c039f08cb0714b3895f29673e74a8b"

RPROVIDES:${PN} += "libaddrxlat-devel \
pkgconfig-libaddrxlat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libaddrxlat3"

inherit rpm
