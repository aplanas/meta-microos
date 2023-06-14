SUMMARY = "GDAL library header files"
DESCRIPTION = "Development Libraries for the GDAL file format library"
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "gdal-devel-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "8a9286071400a2b87725fdca0910dba7e233d7d8e98dbc901c4491ffdfe24f21994d29039a0f703cad4b20cb522168447e249d6aa693c24aab8d9ca0f4804b25"

RPROVIDES:${PN} += "cmake-GDAL \
gdal-devel \
libgdal-devel \
libgdal32-devel \
pkgconfig-gdal"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libgdal32 \
pkgconfig-libopenjp2"

inherit rpm
