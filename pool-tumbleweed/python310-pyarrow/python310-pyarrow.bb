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

RPM_NAME = "python310-pyarrow-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "90bc0e02427da1af7c5d5a391289a875d228b52d6672c962b22bd30579627974bdd14ac1a956f382f4a26157e2735c8bcb4da52fd185a3e3d65798fd53ce80ab"

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
