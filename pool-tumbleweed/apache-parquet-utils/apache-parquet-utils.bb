SUMMARY = "Development platform for in-memory data - development files"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides utilities for working with the Parquet format."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.0"

RPM_NAME = "apache-parquet-utils-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "f9bf3b41cc01157b5aa72d894b6fa4cc72735ba397ec8602440a623a0a57d7f76b4c12c0cdf21c2baf025d90786efe94b49af8c88d9d611dd2ebaad50edc3673"

RPROVIDES:${PN} += "apache-parquet-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libparquet.so.1200 \
libstdc++.so.6"

inherit rpm
