SUMMARY = "GDAL/OGR - a translator library for raster and vector geospatial data formats"
DESCRIPTION = "GDAL is a translator library for raster geospatial data formats that \
is released under an Open Source license. As a library, it presents a \
single abstract data model to the calling application for all \
supported formats. The related OGR library (which lives within the \
GDAL source tree) provides a similar capability for simple features \
vector data."
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "gdal-3.6.3-1.4.aarch64.rpm"
RPM_HASH = "3c5fa7aad6391bb17a9b2c0d6bd9e5b994fb32d8a5f597e704b66dc78c92f06c647c132aa37cefb561b811ddbc3b79bd45e5fefccbacafad54c017d099550fb5"

RPROVIDES:${PN} += "gdal gdal(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdal.so.32()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) python3-GDAL"

inherit rpm
