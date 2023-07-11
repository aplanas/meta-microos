SUMMARY = "Headers and shared development libraries for hwloc"
DESCRIPTION = "This package contains the headers and shared object symbolic links \
for the hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.1"

RPM_NAME = "hwloc-devel-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "31263d326febb687783222c892dd1971244be28411ae8860c0520f331daafe50e34a613d3c92eab37e05ef012ca75a50af56d30e4f68cfecac9e891bb0666e59"

RPROVIDES:${PN} += "hwloc-devel \
libhwloc-devel \
pkgconfig-hwloc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhwloc15 \
pkgconfig-libxml-2.0 \
pkgconfig-pciaccess"

inherit rpm
