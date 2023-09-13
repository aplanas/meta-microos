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

PV = "13.0.0"

RPM_NAME = "apache-arrow-devel-static-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "46e563f8fc517a5854b45d40a96f81f13eec60a921a3f9e13889e9f9283959085de3a95b8ef6899b9aafcfe3462b9c884ee4312b7bb5d200671d204f798564e4"

RPROVIDES:${PN} += "apache-arrow-devel-static"

RDEPENDS:${PN} += "apache-arrow-devel"

inherit rpm
