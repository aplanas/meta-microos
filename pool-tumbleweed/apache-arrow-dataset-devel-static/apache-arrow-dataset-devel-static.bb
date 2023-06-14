SUMMARY = "Development platform for in-memory data - development files"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the static library for Dataset API support"
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.0"

RPM_NAME = "apache-arrow-dataset-devel-static-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "548c989cd556acf87bb89b9c02ca1883badd66c6fa04143bd4a06c640437ddba79d56066525016f3fa2d966761badd78424761954db82edc40824dd6e1749e78"

RPROVIDES:${PN} += "apache-arrow-dataset-devel-static"

RDEPENDS:${PN} += "apache-arrow-devel"

inherit rpm
