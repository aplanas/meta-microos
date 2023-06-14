SUMMARY = "Development platform for in-memory data - development files"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the static library for the Acero streaming execution engine"
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.0"

RPM_NAME = "apache-arrow-acero-devel-static-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "61414d74c2eb9dcc674ac4f01e9600f28f200578ee510a1aab14636dced4e897afa09752091675689370ecd06584b6d3f2be287813a74083a9e1ab98c9a1329b"

RPROVIDES:${PN} += "apache-arrow-acero-devel-static"

RDEPENDS:${PN} += "apache-arrow-devel"

inherit rpm
