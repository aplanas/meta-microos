SUMMARY = "Development Environment for shapelib"
DESCRIPTION = "The Shapefile C Library provides the ability to write simple C programs for \
reading, writing and updating (to a limited extent) ESRI Shapefiles, and the \
associated attribute file (.dbf). \
 \
This package contains the development environment for shapelib project."
LICENSE = "GPL-2.0-or-later & (LGPL-2.0-or-later | MIT) & SUSE-Public-Domain"

PV = "1.5.0"

RPM_NAME = "libshp-devel-1.5.0-2.8.aarch64.rpm"
RPM_HASH = "d18b1ac21bd472a0dbf7fd45b740aef7a0362238766bad1bfd50f64293df26709cef4c496e94a64818b09dc01c4eeb0ebc3883e40bee20356742b53fd27fc936"

RPROVIDES:${PN} += "libshp-devel \
pkgconfig-shapelib \
shapelib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshp2"

inherit rpm
