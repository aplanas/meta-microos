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

RPM_NAME = "python311-pyarrow-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "0b34dcbfa158dca02f4ca2b3a4742e15981e3de631d93f9b698f3f416bd895aa8819a3e42f1b78b1f5601ab2eba4d5ba98123c56a1d7c36f1f9e7b90a516a71f"

RPROVIDES:${PN} += "lib.cpython-311-aarch64-linux-gnu.so \
libarrow-python.so \
python3-pyarrow \
python3.11dist-pyarrow \
python311-pyarrow \
python3dist-pyarrow"

RDEPENDS:${PN} += "libarrow-acero.so.1200 \
libarrow-dataset.so.1200 \
libarrow.so.1200 \
libc.so.6 \
libgcc-s.so.1 \
libparquet.so.1200 \
libstdc++.so.6 \
python-abi \
python311-numpy"

inherit rpm
