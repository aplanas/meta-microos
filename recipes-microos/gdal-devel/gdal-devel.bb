SUMMARY = "GDAL library header files"
DESCRIPTION = "Development Libraries for the GDAL file format library"
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "gdal-devel-3.6.3-1.4.aarch64.rpm"
RPM_HASH = "adceb7af98af2b75071c786bc360967972a6328e91879b8f436187a7c583de880ef8a605a6972b33806a23706c4bfffa656cd61c76c1850d23375434139ab859"

RPROVIDES:${PN} += "cmake(GDAL) gdal-devel gdal-devel(aarch-64) libgdal-devel libgdal32-devel pkgconfig(gdal)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libgdal32 pkgconfig(libopenjp2)"

inherit rpm
