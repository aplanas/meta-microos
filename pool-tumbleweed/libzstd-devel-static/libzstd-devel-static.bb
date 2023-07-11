SUMMARY = "Development files for the Zstd compression library"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
Needed for compiling programs that link with the library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "libzstd-devel-static-1.5.5-3.2.aarch64.rpm"
RPM_HASH = "7547c7be5c9f384728d7706e9d073059518b9ed231b67dc1777615d696bd5cb567f152742bdc5c62726563f5c43acc8eab322732b9fba6d8dab59159152c7d13"

RPROVIDES:${PN} += "libzstd-devel-static"

RDEPENDS:${PN} += "libzstd-devel"

inherit rpm
