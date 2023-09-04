SUMMARY = "Python library for Apache Arrow"
DESCRIPTION = "Python library for Apache Arrow. \
 \
Apache Arrow defines a language-independent columnar \
memory format for flat and hierarchical data, organized \
for efficient analytic operations on modern hardware like \
CPUs and GPUs. The Arrow memory format also supports \
zero-copy reads for lightning-fast data access without \
serialization overhead. \
 \
Arrow's libraries implement the format and provide building \
blocks for a range of use cases, including high performance \
analytics. Many popular projects use Arrow to ship columnar \
data efficiently or as the basis for analytic engines."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.1"

RPM_NAME = "python310-pyarrow-12.0.1-2.1.aarch64.rpm"
RPM_HASH = "695fd9860e318b2cf85f685635fc5506a5f1bc9ec7edde6b682c8c8baf5f01f02fc1bc50de87bd22b177ff5ee934e285129a6e69e8193a95af251e9032d8d130"

RPROVIDES:${PN} += "lib.cpython-310-aarch64-linux-gnu.so \
libarrow-python.so \
python3.10dist-pyarrow \
python310-pyarrow \
python3dist-pyarrow"

RDEPENDS:${PN} += "libarrow-acero.so.1200 \
libarrow-dataset.so.1200 \
libarrow.so.1200 \
libc.so.6 \
libgcc-s.so.1 \
libparquet.so.1200 \
libstdc++.so.6 \
python-abi \
python310-numpy"

inherit rpm
