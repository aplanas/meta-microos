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

PV = "12.0.1"

RPM_NAME = "apache-parquet-utils-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "493a5091f84d83c2e8b040530bb12b656ba11d73bc5e0247717582b6ba0e8ebe21e4d8bea2752329cd570ab3d400bb1660df69b7032b653575e6600b31fa5890"

RPROVIDES:${PN} += "apache-parquet-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libparquet.so.1200 \
libstdc++.so.6"

inherit rpm
