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

RPM_NAME = "python311-pyarrow-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "06e6a3889e6e611b0417ddd508657466f5b15d793ab321447d95e3833bb70a6a8a049d65db05ec50d65b3cac379a18d46499f63cc929523adb42a9f8d43528f8"

RPROVIDES:${PN} += "lib.cpython-311-aarch64-linux-gnu.so \
libarrow-python.so \
python3-pyarrow \
python3.11dist-pyarrow \
python311-pyarrow \
python3dist-pyarrow"

RDEPENDS:${PN} += "libarrow-acero.so.1300 \
libarrow-dataset.so.1300 \
libarrow.so.1300 \
libc.so.6 \
libgcc-s.so.1 \
libparquet.so.1300 \
libstdc++.so.6 \
python-abi \
python311-numpy"

inherit rpm
