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

PV = "11.0.0"

RPM_NAME = "apache-arrow-dataset-devel-static-11.0.0-2.1.aarch64.rpm"
RPM_HASH = "c4ef23269fd0ad579e27eaac01b772fa7b4f9ab3ee7a214f3dcbdb03113f2f5186685a67a06a2b36be241341a451e7332a2e0540ee1fbb1d018358913dfc6f9b"

RPROVIDES:${PN} += "apache-arrow-dataset-devel-static apache-arrow-dataset-devel-static(aarch-64)"
RDEPENDS:${PN} += "apache-arrow-devel"

inherit rpm
