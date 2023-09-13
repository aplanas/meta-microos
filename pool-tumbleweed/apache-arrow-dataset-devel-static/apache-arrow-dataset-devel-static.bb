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

PV = "13.0.0"

RPM_NAME = "apache-arrow-dataset-devel-static-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "af650fee8e6665db73258e60dda733cf484860d1e1e0a6d79c2b375df548c5ef6361eda3b8d53c439df03f2926615aacf108d07c0fdfa1b442d274b845a9baad"

RPROVIDES:${PN} += "apache-arrow-dataset-devel-static"

RDEPENDS:${PN} += "apache-arrow-devel"

inherit rpm
