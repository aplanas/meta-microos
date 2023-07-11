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

PV = "12.0.1"

RPM_NAME = "apache-parquet-devel-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "4abe141d38aed1cb8c2754df6bf69fa44c56dbb8487115d75c74c641f2a950710ffc733ade2b2e77cf1410f9c0fd5d911cbde52adc7d13ee5424f118c9d8f3fc"

RPROVIDES:${PN} += "apache-parquet-devel \
cmake-Parquet \
pkgconfig-parquet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libparquet1200 \
pkgconfig-arrow"

inherit rpm
