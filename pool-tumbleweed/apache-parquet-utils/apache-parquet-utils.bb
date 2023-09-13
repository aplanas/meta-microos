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

PV = "13.0.0"

RPM_NAME = "apache-parquet-utils-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "ef8a3431158077fbf6ab04f5769ed967d347bd74d4a24684c5db8de36c637563fabda71843aeb98eb230585691b84799433344ffa962b7be1d3daa280a0c504b"

RPROVIDES:${PN} += "apache-parquet-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libparquet.so.1300 \
libstdc++.so.6"

inherit rpm
