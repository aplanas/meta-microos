SUMMARY = "Development platform for in-memory data - development files"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the development libraries and headers for \
the Parquet format."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "13.0.0"

RPM_NAME = "apache-parquet-devel-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "13e7943cad12659a44e611ab9696bcf4435d0c4a31bd5d11af19d51c64bf0191341caf5c613cdd5c72a6cca4ef4e9fb6f56597e0cb53344c53fe3ef9c8c768a6"

RPROVIDES:${PN} += "apache-parquet-devel \
cmake-Parquet \
pkgconfig-parquet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libparquet1300 \
pkgconfig-arrow"

inherit rpm
