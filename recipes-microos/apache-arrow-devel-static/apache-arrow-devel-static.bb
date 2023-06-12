SUMMARY = "Development platform for in-memory data - development files"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the static library"
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.0"

RPM_NAME = "apache-arrow-devel-static-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "d20d38a6a3fba245cf7075756794fc1217004633cf15923ef5f90db99d320df5adef8d050f3f07a13aa55ec235bf63cc0fbe760f90f6e85875deb5aa048616ae"

RPROVIDES:${PN} += "apache-arrow-devel-static apache-arrow-devel-static(aarch-64)"
RDEPENDS:${PN} += "apache-arrow-devel"

inherit rpm
