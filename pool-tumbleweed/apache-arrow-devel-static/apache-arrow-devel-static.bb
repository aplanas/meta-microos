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

PV = "12.0.1"

RPM_NAME = "apache-arrow-devel-static-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "8412bfbf3513e384809522d370628f3a8b8d324c88e6bfd3ea869be4e2fea1a78d1fcb36400b55041d1eab9adc124c5e4a50ee7310ed5aacc35f11eaa6655e92"

RPROVIDES:${PN} += "apache-arrow-devel-static"

RDEPENDS:${PN} += "apache-arrow-devel"

inherit rpm
