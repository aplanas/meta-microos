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

PV = "13.0.0"

RPM_NAME = "apache-parquet-devel-static-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "47a0a3c8c382ef31a2abff57c1cab71e9d1fa165657256a8b17deab8f721405c2d4bde5ac548562025dcee1ef5b376ea51aac01e597ce513a5408f817da17891"

RPROVIDES:${PN} += "apache-parquet-devel-static"

RDEPENDS:${PN} += "apache-parquet-devel"

inherit rpm
