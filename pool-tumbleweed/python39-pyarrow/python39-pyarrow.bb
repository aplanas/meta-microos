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

PV = "13.0.0"

RPM_NAME = "python39-pyarrow-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "d6d572b7769e0e3741e58b93542b0ec7c6f620cf5593b8a6e21c2cc91309df510273f4e4911c39eaaaa3b992256a3b8249d0f05b51d9a8f3fa32245f4138ba8c"

RPROVIDES:${PN} += "lib.cpython-39-aarch64-linux-gnu.so \
libarrow-python.so \
python3.9dist-pyarrow \
python39-pyarrow \
python3dist-pyarrow"

RDEPENDS:${PN} += "libarrow-acero.so.1300 \
libarrow-dataset.so.1300 \
libarrow.so.1300 \
libc.so.6 \
libgcc-s.so.1 \
libparquet.so.1300 \
libstdc++.so.6 \
python-abi \
python39-numpy"

inherit rpm
