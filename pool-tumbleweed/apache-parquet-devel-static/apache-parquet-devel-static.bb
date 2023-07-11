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

PV = "12.0.1"

RPM_NAME = "apache-parquet-devel-static-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "0742ccacad4e59c10af24f3b327a75a2e301a8201f33533a1c75e7dac088f9c0eae1b17e9b932b339e441b36b85c97e37938345671bab4ab3915181acc4552c8"

RPROVIDES:${PN} += "apache-parquet-devel-static"

RDEPENDS:${PN} += "apache-parquet-devel"

inherit rpm
