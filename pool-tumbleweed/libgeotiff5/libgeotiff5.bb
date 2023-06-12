SUMMARY = "Shared libraries for GeoTIFF library"
DESCRIPTION = "Shared libraries for GeoTIFF library. \
 \
This library is designed to permit the extraction and parsing of the \
'GeoTIFF' Key directories, as well as definition and installation of \
GeoTIFF keys in new files."
LICENSE = "MIT & SUSE-Public-Domain"

PV = "1.7.1"

RPM_NAME = "libgeotiff5-1.7.1-2.3.aarch64.rpm"
RPM_HASH = "c6039325d2cb2ccbc8efcbcedc2f9723650fe8dd8e30ba425933fe69af0aa64eede57c9801a81f6d2486c9241e1a4725e59b3c8262e594fdb55e21a312a22184"

RPROVIDES:${PN} += "libgeotiff.so.5()(64bit) \
libgeotiff5 \
libgeotiff5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit) \
libproj.so.25()(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
