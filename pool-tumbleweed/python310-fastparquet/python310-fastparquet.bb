SUMMARY = "Python support for Parquet file format"
DESCRIPTION = "This is a Python implementation of the parquet format \
for integrating it into python-based Big Data workflows."
LICENSE = "Apache-2.0"

PV = "2023.7.0"

RPM_NAME = "python310-fastparquet-2023.7.0-1.1.aarch64.rpm"
RPM_HASH = "8df5c6410abf36fd490f973044459c49576f9865ffa5609d5312adfcc8f02b8b86a273b1f25e75ffd4105b428b1a6ed8d2e1749a0a4c75c89a1b7acf32bd2e21"

RPROVIDES:${PN} += "python3.10dist-fastparquet \
python310-fastparquet \
python3dist-fastparquet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-cramjam \
python310-fsspec \
python310-numpy \
python310-packaging \
python310-pandas"

inherit rpm
