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

PV = "12.0.1"

RPM_NAME = "apache-arrow-acero-devel-static-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "9bfd7640fb4558823d45a7fe0dbb779f833cfb7f8062973efdf24ba3e65ba8f648f6cab799760541fe226cd5c5cee342c51e79fde7913fcc5d4790ae8d63b526"

RPROVIDES:${PN} += "apache-arrow-acero-devel-static"

RDEPENDS:${PN} += "apache-arrow-devel"

inherit rpm
