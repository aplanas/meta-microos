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

PV = "13.0.0"

RPM_NAME = "apache-arrow-devel-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "bfe01169393d808a243c31decd09db7a7f97cd6a7f5f9d173ec71039b4187fade92caa53a182f627b661ad0bc0c3ebff4e36b557f1d9f1ee80cad009aebd9b17"

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
libarrow-acero1300 \
libarrow-dataset1300 \
libarrow1300 \
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
