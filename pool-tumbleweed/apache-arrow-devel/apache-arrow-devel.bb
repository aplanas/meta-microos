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

PV = "12.0.0"

RPM_NAME = "apache-arrow-devel-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "9bbc01a04160a2ba886cd0ff598966947fc6e6389f6d25618bdd63c84f509f9ea93aab29fc252a761560a32d25ea0fdd3a194f85359cec2fc46089218127fbc7"

RPROVIDES:${PN} += "apache-arrow-devel \
apache-arrow-devel(aarch-64) \
cmake(Arrow) \
cmake(ArrowAcero) \
cmake(ArrowDataset) \
cmake(ArrowTesting) \
cmake(arrow) \
pkgconfig(arrow) \
pkgconfig(arrow-acero) \
pkgconfig(arrow-compute) \
pkgconfig(arrow-csv) \
pkgconfig(arrow-dataset) \
pkgconfig(arrow-filesystem) \
pkgconfig(arrow-json)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libarrow1200 \
libarrow_acero1200 \
libarrow_dataset1200 \
pkgconfig(arrow) \
pkgconfig(arrow-acero) \
pkgconfig(bzip2) \
pkgconfig(libbrotlidec) \
pkgconfig(libbrotlienc) \
pkgconfig(libglog) \
pkgconfig(liblz4) \
pkgconfig(libutf8proc) \
pkgconfig(libzstd) \
pkgconfig(parquet) \
pkgconfig(snappy) \
pkgconfig(thrift) \
pkgconfig(zlib)"

inherit rpm
