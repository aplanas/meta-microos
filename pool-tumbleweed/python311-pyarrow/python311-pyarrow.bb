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

RPM_NAME = "python311-pyarrow-12.0.1-2.1.aarch64.rpm"
RPM_HASH = "c647275e2b9e914e6c004e8af77b9e64079fb7a23e72eb976bbebf9765e7d77095c06a35d60dcfeb33cdfd74fcaf3de31865462a4c6075732b2c50a7a5ec8b1a"

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
