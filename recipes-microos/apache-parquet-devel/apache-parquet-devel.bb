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

PV = "12.0.0"

RPM_NAME = "apache-parquet-devel-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "85201008d376570d40f0bb2fb24f068636b5fbffbe0649d664cbe76e8b29dcb672fd5885ec00646f3fbbbd09f7b1e96a01564cf8d6ac53e76f78d6024254b101"

RPROVIDES:${PN} += "apache-parquet-devel apache-parquet-devel(aarch-64) cmake(Parquet) pkgconfig(parquet)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libparquet1200 pkgconfig(arrow)"

inherit rpm
