SUMMARY = "A development platform for in-memory data"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.1"

RPM_NAME = "apache-arrow-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "4f2190996fdac6a76b9b5c4d9834e9f234521a620577be69f82294fd9edcdfb1d84a17b676dc59e55fcdcb039f019ceceeb480ff73867d5a0472057f4e814ec8"

RPROVIDES:${PN} += "apache-arrow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglog.so.0 \
liblz4.so.1 \
libsnappy.so.1 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
