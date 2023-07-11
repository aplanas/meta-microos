SUMMARY = "Development files for snappy"
DESCRIPTION = "Snappy is a compression/decompression library. It does not aim for maximum \
compression, or compatibility with any other compression library; instead, it \
aims for high speeds and reasonable compression. \
 \
This package holds the development files for snappy."
LICENSE = "BSD-3-Clause"

PV = "1.1.9"

RPM_NAME = "snappy-devel-1.1.9-2.9.aarch64.rpm"
RPM_HASH = "37c4c4ee823a3a465a1d113f5507e166424788164a84901a3c65eb8279f8d4cc2d192b3ebd9afb20933ad1c20de1daf4fcda24cb540b17019ad7ab55e8cca2a3"

RPROVIDES:${PN} += "cmake-Snappy \
pkgconfig-snappy \
snappy-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsnappy1"

inherit rpm
