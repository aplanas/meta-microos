SUMMARY = "Development platform for in-memory data - development files"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the static library for the Parquet format."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.0"

RPM_NAME = "apache-parquet-devel-static-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "6e98d3eb644412a13784177728334d8c72fb97f24b5165893253d7b13b4467c7b45911e1febab6e8b34c73cb2f6a91c1813fe32ae475a99080e29b78c0f73f6c"

RPROVIDES:${PN} += "apache-parquet-devel-static \
apache-parquet-devel-static(aarch-64)"

RDEPENDS:${PN} += "apache-parquet-devel"

inherit rpm
