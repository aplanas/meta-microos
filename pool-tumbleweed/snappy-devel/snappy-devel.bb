SUMMARY = "Development files for snappy"
DESCRIPTION = "Snappy is a compression/decompression library. It does not aim for maximum \
compression, or compatibility with any other compression library; instead, it \
aims for high speeds and reasonable compression. \
 \
This package holds the development files for snappy."
LICENSE = "BSD-3-Clause"

PV = "1.1.9"

RPM_NAME = "snappy-devel-1.1.9-2.8.aarch64.rpm"
RPM_HASH = "30d75375614accc6eac2c5b6c455b050a1571070035857cc4c42c81f987d886ca74db4a627b917bb3670a7a9e9749ea628a1b2096b852ff58b481d5f6c354b2b"

RPROVIDES:${PN} += "cmake(Snappy) \
pkgconfig(snappy) \
snappy-devel \
snappy-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsnappy1"

inherit rpm
