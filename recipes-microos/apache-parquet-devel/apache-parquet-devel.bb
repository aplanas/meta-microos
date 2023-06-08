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

PV = "11.0.0"

RPM_NAME = "apache-parquet-devel-11.0.0-2.1.aarch64.rpm"
RPM_HASH = "6f110e6a9787b3fc146f64b4f6acf8d72901695f799a5e4e9f8164dea3461b3f7315f0027458249554465195442e034486010bfec30c547499eddeb8e64d28e0"

RPROVIDES:${PN} += "apache-parquet-devel apache-parquet-devel(aarch-64) cmake(Parquet) pkgconfig(parquet)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libparquet1100 pkgconfig(arrow)"

inherit rpm
