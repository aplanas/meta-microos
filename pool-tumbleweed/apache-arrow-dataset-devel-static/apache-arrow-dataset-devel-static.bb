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

PV = "12.0.1"

RPM_NAME = "apache-arrow-dataset-devel-static-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "918c95a9201c55592b43e8a2756f3931f7f09002767f816f3748bd66d46b5b188559e69d86899950b49da7c72ff1ca0434799a357042cc7a95ffe2eb3e9de9b2"

RPROVIDES:${PN} += "apache-arrow-dataset-devel-static"

RDEPENDS:${PN} += "apache-arrow-devel"

inherit rpm
