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

PV = "12.0.1"

RPM_NAME = "apache-arrow-devel-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "77b41d8ff6033029b5d2b8e17a59a9ec4e4cc23ba33579e1aba2602715e046478c6b26c3f023d5b0c79793dcce2984d26c97bc7f852004907b34e73de771a474"

RPROVIDES:${PN} += "apache-arrow-devel \
cmake-Arrow \
cmake-ArrowAcero \
cmake-ArrowDataset \
cmake-ArrowTesting \
cmake-arrow \
pkgconfig-arrow \
pkgconfig-arrow-acero \
pkgconfig-arrow-compute \
pkgconfig-arrow-csv \
pkgconfig-arrow-dataset \
pkgconfig-arrow-filesystem \
pkgconfig-arrow-json"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libarrow-acero1200 \
libarrow-dataset1200 \
libarrow1200 \
pkgconfig-arrow \
pkgconfig-arrow-acero \
pkgconfig-bzip2 \
pkgconfig-libbrotlidec \
pkgconfig-libbrotlienc \
pkgconfig-libglog \
pkgconfig-liblz4 \
pkgconfig-libutf8proc \
pkgconfig-libzstd \
pkgconfig-parquet \
pkgconfig-snappy \
pkgconfig-thrift \
pkgconfig-zlib"

inherit rpm
