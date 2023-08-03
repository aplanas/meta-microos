SUMMARY = "Headers and shared development libraries for hwloc"
DESCRIPTION = "This package contains the headers and shared object symbolic links \
for the hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.2"

RPM_NAME = "hwloc-devel-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "4a6f50724503944a8c7b9b96c341e0a16fa9c049dd59d6be24cc16fd34f2ea50482086e8af61c929ef408dc835212fe3dd333982f902d98923eb8a55b6ed2c33"

RPROVIDES:${PN} += "hwloc-devel \
libhwloc-devel \
pkgconfig-hwloc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhwloc15 \
pkgconfig-libxml-2.0 \
pkgconfig-pciaccess"

inherit rpm
