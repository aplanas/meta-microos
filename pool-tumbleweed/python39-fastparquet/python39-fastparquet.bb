SUMMARY = "Python support for Parquet file format"
DESCRIPTION = "This is a Python implementation of the parquet format \
for integrating it into python-based Big Data workflows."
LICENSE = "Apache-2.0"

PV = "2023.7.0"

RPM_NAME = "python39-fastparquet-2023.7.0-1.1.aarch64.rpm"
RPM_HASH = "7373166206ef3f1ee19a745818307f3b11f48d19732b3e612f503f21c2a2351e323bd9c1e6fb999e3341152dced6d1b4aabfd2b9ac7b83f44fe396ebc03e4723"

RPROVIDES:${PN} += "python3.9dist-fastparquet \
python39-fastparquet \
python3dist-fastparquet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-cramjam \
python39-fsspec \
python39-numpy \
python39-packaging \
python39-pandas"

inherit rpm
