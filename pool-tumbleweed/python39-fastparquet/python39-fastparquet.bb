SUMMARY = "Python support for Parquet file format"
DESCRIPTION = "This is a Python implementation of the parquet format \
for integrating it into python-based Big Data workflows."
LICENSE = "Apache-2.0"

PV = "2023.4.0"

RPM_NAME = "python39-fastparquet-2023.4.0-1.1.aarch64.rpm"
RPM_HASH = "ef104f1e9b453786f537fd0dac457f7b2d24401fec0c92616fbe1aa29543a596c2fd99e3d1801c412289a0d0fa4500fae45245d8940c20c7d889a79783032a7e"

RPROVIDES:${PN} += "python3.9dist(fastparquet) \
python39-fastparquet \
python39-fastparquet(aarch-64) \
python3dist(fastparquet)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-cramjam \
python39-fsspec \
python39-numpy \
python39-packaging \
python39-pandas"

inherit rpm
