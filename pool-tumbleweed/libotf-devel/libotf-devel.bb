SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libotf."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.16"

RPM_NAME = "libotf-devel-0.9.16-1.10.aarch64.rpm"
RPM_HASH = "00835a387fc7beb926502d9c9e5cbefbd7f4e055eb6d846492526681e453d1dd093ec414a0265d6ffa29702c249cef9b96d365e96c0e19722aebc9908ae2a75a"

RPROVIDES:${PN} += "libotf-devel \
pkgconfig-libotf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libotf \
pkgconfig-freetype2"

inherit rpm
