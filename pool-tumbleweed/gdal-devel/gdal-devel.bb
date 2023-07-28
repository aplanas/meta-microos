SUMMARY = "GDAL library header files"
DESCRIPTION = "Development Libraries for the GDAL file format library"
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "gdal-devel-3.6.3-2.6.aarch64.rpm"
RPM_HASH = "35b3213172a7606facd21359bfe644e124c4fa81a00215afea888a3f463afb90968226384aade2496eca1509ff2ce9d1d7da7ecac74b96b3736b9364a401cb73"

RPROVIDES:${PN} += "cmake-GDAL \
gdal-devel \
libgdal-devel \
libgdal32-devel \
pkgconfig-gdal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgdal32 \
pkgconfig-libopenjp2"

inherit rpm
