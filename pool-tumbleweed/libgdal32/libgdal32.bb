SUMMARY = "GDAL static libraries"
DESCRIPTION = "GDAL and OGR are translator libraries for raster and vector geospatial data \
formats. As a library, it presents a single abstract data model to the calling \
application for all supported formats."
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "libgdal32-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "590360c622f2ee597e61aa38125702d90c18668047a92c13aec23a8a8a9e5b6315f6c81ef8d223c467aef3080c9c376978bd105b1e062bd0c4d076113b48599d"

RPROVIDES:${PN} += "libgdal.so.32()(64bit) \
libgdal32 \
libgdal32(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libImath-3_1.so.29()(64bit) \
libOpenCL.so.1()(64bit) \
libOpenEXR-3_1.so.30()(64bit) \
libarmadillo.so.12()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcryptopp.so.8.7.0()(64bit) \
libcurl.so.4()(64bit) \
libdeflate.so.0()(64bit) \
libexpat.so.1()(64bit) \
libfreexl.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgeos_c.so.1()(64bit) \
libgeotiff.so.5()(64bit) \
libgif.so.7()(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_cpp.so.200()(64bit) \
libjpeg.so.8()(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_PRIVATE)(64bit) \
libkea.so.1.5()(64bit) \
liblz4.so.1()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libnetcdf.so.19()(64bit) \
libodbc.so.2()(64bit) \
libodbcinst.so.2()(64bit) \
libopenjp2.so.7()(64bit) \
libpcre2-8.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpoppler.so.128()(64bit) \
libpq.so.5()(64bit) \
libproj.so.25()(64bit) \
libspatialite.so.7()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libwebp.so.7()(64bit) \
libxerces-c-3.2.so()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
