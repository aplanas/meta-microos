SUMMARY = "GDAL library header files"
DESCRIPTION = "Development Libraries for the GDAL file format library"
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "gdal-devel-3.6.3-2.4.aarch64.rpm"
RPM_HASH = "94eef9540712017fb39c0fb9dd3d0c64c26930d4a0958dc7e0e48e770c411c39d993c0cc5281328723a45d819ad6c5aeb47eb4486d727deffdac76ef5e81fd9d"

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
