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

PV = "12.0.0"

RPM_NAME = "python39-pyarrow-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "03d7d446c07b2856bfe64ed8d8881e4a9cbf9c0f6ee573393a920c2126165808978342ea1ff0be51bf05d52ae190a0d9e74f55b57273f085711db77caa6b3a1c"

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
