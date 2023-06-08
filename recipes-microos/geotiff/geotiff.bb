SUMMARY = "Library to handle georeferenced TIFF"
DESCRIPTION = "This library is designed to permit the extraction and parsing of the \
'GeoTIFF' Key directories, as well as definition and installation of \
GeoTIFF keys in new files."
LICENSE = "MIT & SUSE-Public-Domain"

PV = "1.7.1"

RPM_NAME = "geotiff-1.7.1-2.3.aarch64.rpm"
RPM_HASH = "84e22502891e3484c520e75ce5417383a34b706b6596e30a15717c2841535a5612ffa29ba0cfb554f50bc5d9b93360630672f2e10a4878dbe218a9c042a3a092"

RPROVIDES:${PN} += "geotiff geotiff(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgeotiff.so.5()(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
