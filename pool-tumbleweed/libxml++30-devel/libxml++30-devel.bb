SUMMARY = "C++ Interface for XML Files -- Development Files"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.4"

RPM_NAME = "libxml++30-devel-3.2.4-1.3.aarch64.rpm"
RPM_HASH = "c0443df8409430ab0abf80e58caba47e6957ec96f49ab70ac6a83f665f2c71f19e7c4a03bc7b5aa2fb59707c5385db44d365dfc822c76a2db62ab8542b6cb369"

RPROVIDES:${PN} += "libxml++30-devel \
pkgconfig-libxml++-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibmm2-devel \
libxml++-3-0-1 \
pkgconfig-glibmm-2.4 \
pkgconfig-libxml-2.0"

inherit rpm
