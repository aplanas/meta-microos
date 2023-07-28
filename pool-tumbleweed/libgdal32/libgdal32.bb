SUMMARY = "GDAL static libraries"
DESCRIPTION = "GDAL and OGR are translator libraries for raster and vector geospatial data \
formats. As a library, it presents a single abstract data model to the calling \
application for all supported formats."
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "libgdal32-3.6.3-2.6.aarch64.rpm"
RPM_HASH = "216046b63e22ef13ad538a12a105251e769434bad2580b499a559ac31815f985b6c78bc4401aa8219d7e5227a3abf0c4f3b13be43a49f197751649b426c2f83b"

RPROVIDES:${PN} += "libgdal.so.32 \
libgdal32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libImath-3-1.so.29 \
libOpenCL.so.1 \
libOpenEXR-3-1.so.30 \
libarmadillo.so.12 \
libc.so.6 \
libcrypto.so.3 \
libcryptopp.so.8.8.0 \
libcurl.so.4 \
libdeflate.so.0 \
libexpat.so.1 \
libfreexl.so.1 \
libgcc-s.so.1 \
libgeos-c.so.1 \
libgeotiff.so.5 \
libgif.so.7 \
libhdf5-cpp.so.200 \
libhdf5.so.200 \
libjpeg.so.8 \
libjson-c.so.5 \
libkea.so.1.5 \
liblz4.so.1 \
liblzma.so.5 \
libm.so.6 \
libmariadb.so.3 \
libnetcdf.so.19 \
libodbc.so.2 \
libodbcinst.so.2 \
libopenjp2.so.7 \
libpcre2-8.so.0 \
libpng16.so.16 \
libpoppler.so.130 \
libpq.so.5 \
libproj.so.25 \
libspatialite.so.7 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtiff.so.6 \
libwebp.so.7 \
libxerces-c-3.2.so \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
