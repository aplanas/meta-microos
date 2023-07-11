SUMMARY = "Development files for libspatialite"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libspatialite."
LICENSE = "MPL-1.1"

PV = "5.0.1"

RPM_NAME = "libspatialite-devel-5.0.1-2.11.aarch64.rpm"
RPM_HASH = "e0012cfad3be23afef80fea65154b410caa29651261af1de26ab67d23a84b68a2ecb69a796d5e279f4e8b740c76c6cbb8d20cadc993231c4c207cadee2958ad8"

RPROVIDES:${PN} += "libspatialite-devel \
pkgconfig-spatialite"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspatialite7"

inherit rpm
