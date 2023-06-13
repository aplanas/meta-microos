SUMMARY = "A development platform for in-memory data"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.0"

RPM_NAME = "apache-arrow-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "8f16811ef55f8cc44b94e9b3067cb6a47b74f8c0c166036688013ad7711ba228f1f7557b2a037090f09f462783d3bafcfb1b652466b6ceeb78463196b5e079c5"

RPROVIDES:${PN} += "apache-arrow \
apache-arrow(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbrotlidec.so.1()(64bit) \
libbrotlienc.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglog.so.0()(64bit) \
liblz4.so.1()(64bit) \
libsnappy.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
