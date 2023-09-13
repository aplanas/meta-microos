SUMMARY = "A development platform for in-memory data"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "13.0.0"

RPM_NAME = "apache-arrow-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "293be1e2286443f437123cb066f8512fc672ba8a787fe29dd2435b4a0d671df0c53175f10d48f5571344971beb7af665d7ab480fe69e80c5e752cf185e19bc4b"

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
