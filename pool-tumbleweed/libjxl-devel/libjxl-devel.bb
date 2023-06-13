SUMMARY = "Development for libjxl, an en-/decoder for JPEG XL"
DESCRIPTION = "JPEG XL is a raster-graphics file format that supports both lossy and \
lossless compression. \
 \
This is the reference implementation of JPEG XL, with encoder and decoder."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "libjxl-devel-0.8.1-3.1.aarch64.rpm"
RPM_HASH = "d5d85bf17d2888d6a31f59f4259070a3ffc4ba546a269d8ca8b6059c6732ba001c667b8971c1f3db76cb88403a7ce4de21e8cfbdb1b8ca5e3f00cbd7057280f4"

RPROVIDES:${PN} += "libjxl-devel \
libjxl-devel(aarch-64) \
pkgconfig(libjxl) \
pkgconfig(libjxl_threads)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjxl0_8 \
pkgconfig(lcms2) \
pkgconfig(libbrotlicommon) \
pkgconfig(libbrotlidec) \
pkgconfig(libbrotlienc) \
pkgconfig(libhwy)"

inherit rpm
