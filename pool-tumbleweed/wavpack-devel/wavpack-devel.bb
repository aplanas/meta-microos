SUMMARY = "Development files for wavpack, an audio compression format"
DESCRIPTION = "WavPack is an open audio compression format providing lossless, high-quality \
lossy, and unique hybrid compression modes. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of wavpack."
LICENSE = "BSD-3-Clause"

PV = "5.6.0"

RPM_NAME = "wavpack-devel-5.6.0-1.4.aarch64.rpm"
RPM_HASH = "e86ff9c3f33cf3a8a4538715a246736f750e67f68b6df81898d331efb15b422a63f9e8bcff846ecc8e6b2b855398641c54774adc1e9c37d48f80da5bcfaf8d2e"

RPROVIDES:${PN} += "pkgconfig-wavpack \
wavpack-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
wavpack"

inherit rpm
