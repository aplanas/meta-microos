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

RPM_NAME = "python310-pyarrow-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "d6b40e4f9dd257f79fe4d4fe0f98b6062d83e9f0372eb9dae0ed41c38a88a41755c20e7af7f733941dd0cacf1bb57029b8f344c43ef66b3d880239d7bbaecd79"

RPROVIDES:${PN} += "lib.cpython-310-aarch64-linux-gnu.so \
libarrow-python.so \
python3.10dist-pyarrow \
python310-pyarrow \
python3dist-pyarrow"

RDEPENDS:${PN} += "libarrow-acero.so.1300 \
libarrow-dataset.so.1300 \
libarrow.so.1300 \
libc.so.6 \
libgcc-s.so.1 \
libparquet.so.1300 \
libstdc++.so.6 \
python-abi \
python310-numpy"

inherit rpm
