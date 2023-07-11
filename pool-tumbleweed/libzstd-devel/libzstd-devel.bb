SUMMARY = "Development files for the Zstd compression library"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
Needed for compiling programs that link with the library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "libzstd-devel-1.5.5-3.2.aarch64.rpm"
RPM_HASH = "0641cebb64bef3e47814926be4857744d693602994a74e80df482f08246a6206d8b76e01768bbae67933fb0560865c889d534cb9d003b7b2c80cd2c1e15876da"

RPROVIDES:${PN} += "libzstd-devel \
pkgconfig-libzstd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libzstd1"

inherit rpm
