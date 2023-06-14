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

RPM_NAME = "python310-pyarrow-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "bb9542889b1a10815cf1db9c1f4bfc4a5710b549c92109cf451b3d637482d0ac079bdbd697c0fd46b0e643e1b6e70c797059bb465c8e59e3f794ba8c8017d210"

RPROVIDES:${PN} += "lib.cpython-310-aarch64-linux-gnu.so \
libarrow-python.so \
python3-pyarrow \
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
