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

RPM_NAME = "python39-pyarrow-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "027d587e3a975b0ffb38233066f1e9f6d514a2b7146281e8d21f935ee4f50bbc9d0a7a91622b0b34f929a2ef27121d4ba7c928fde6c67b3b03e9d4416e76780c"

RPROVIDES:${PN} += "lib.cpython-39-aarch64-linux-gnu.so \
libarrow-python.so \
python3.9dist-pyarrow \
python39-pyarrow \
python3dist-pyarrow"

RDEPENDS:${PN} += "libarrow-acero.so.1200 \
libarrow-dataset.so.1200 \
libarrow.so.1200 \
libc.so.6 \
libgcc-s.so.1 \
libparquet.so.1200 \
libstdc++.so.6 \
python-abi \
python39-numpy"

inherit rpm
