SUMMARY = "Development platform for in-memory data - development files"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the development libraries and headers for \
Apache Arrow."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "11.0.0"

RPM_NAME = "apache-arrow-devel-11.0.0-2.1.aarch64.rpm"
RPM_HASH = "a6bfc1a418bce6f86ed71ad9dab1cbe7915b14817bdd02d1739c1b57d8f17dd206388e6dad94bd9d1dd1ba801dad8385137d8dc6c1d28492277834c806883f58"

RPROVIDES:${PN} += "apache-arrow-devel apache-arrow-devel(aarch-64) cmake(Arrow) cmake(ArrowDataset) cmake(ArrowTesting) cmake(arrow) pkgconfig(arrow) pkgconfig(arrow-compute) pkgconfig(arrow-csv) pkgconfig(arrow-dataset) pkgconfig(arrow-filesystem) pkgconfig(arrow-json)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libarrow1100 libarrow_dataset1100 pkgconfig(arrow) pkgconfig(libbrotlidec) pkgconfig(libbrotlienc) pkgconfig(libglog) pkgconfig(liblz4) pkgconfig(libutf8proc) pkgconfig(libzstd) pkgconfig(parquet) pkgconfig(snappy) pkgconfig(thrift) pkgconfig(zlib)"

inherit rpm
