SUMMARY = "Development files for the Zstd compression library"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
Needed for compiling programs that link with the library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "libzstd-devel-1.5.5-3.1.aarch64.rpm"
RPM_HASH = "c217bdc206246f6f13658092c4037116c3f150c9304deb4ece18b45b6b66f537fe501d49478d6142c1e503bb42a7367ba98ea4b49d160c4b08af997e245b5b83"

RPROVIDES:${PN} += "libzstd-devel \
libzstd-devel(aarch-64) \
pkgconfig(libzstd)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libzstd1"

inherit rpm
