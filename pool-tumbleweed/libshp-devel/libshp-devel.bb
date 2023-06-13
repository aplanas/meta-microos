SUMMARY = "Development Environment for shapelib"
DESCRIPTION = "The Shapefile C Library provides the ability to write simple C programs for \
reading, writing and updating (to a limited extent) ESRI Shapefiles, and the \
associated attribute file (.dbf). \
 \
This package contains the development environment for shapelib project."
LICENSE = "GPL-2.0-or-later & (LGPL-2.0-or-later | MIT) & SUSE-Public-Domain"

PV = "1.5.0"

RPM_NAME = "libshp-devel-1.5.0-2.7.aarch64.rpm"
RPM_HASH = "429cd571a8fd54c8f25e5eaf03eb26895dff805a39d7c4e90a29fee529088750b7181aea04146adfa2f6fb5e99f174c36b258069cd6202a5479ec6db87d74c8c"

RPROVIDES:${PN} += "libshp-devel \
libshp-devel(aarch-64) \
pkgconfig(shapelib) \
shapelib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshp2"

inherit rpm
