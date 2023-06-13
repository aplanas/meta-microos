SUMMARY = "GeoTIFF header files"
DESCRIPTION = "Header files for GeoTIFF library. \
 \
This library is designed to permit the extraction and parsing of the \
'GeoTIFF' Key directories, as well as definition and installation of \
GeoTIFF keys in new files."
LICENSE = "MIT & SUSE-Public-Domain"

PV = "1.7.1"

RPM_NAME = "geotiff-devel-1.7.1-2.3.aarch64.rpm"
RPM_HASH = "9f7e8ca977a8ee681c9988b6edd139933a02631e3d6f4b737e8b4c8ff5c68066965100c456eac1e8083a0a1e5c8611869c6484405f6b93eb4da5215d3445cb93"

RPROVIDES:${PN} += "geotiff-devel \
geotiff-devel(aarch-64) \
libgeotiff-devel \
pkgconfig(libgeotiff)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgeotiff5 \
pkgconfig(libtiff-4) \
pkgconfig(proj)"

inherit rpm
