SUMMARY = "Python support for Parquet file format"
DESCRIPTION = "This is a Python implementation of the parquet format \
for integrating it into python-based Big Data workflows."
LICENSE = "Apache-2.0"

PV = "2023.7.0"

RPM_NAME = "python311-fastparquet-2023.7.0-1.1.aarch64.rpm"
RPM_HASH = "5d7859fc1c8b90dd5360ec1b0fc08ed0deb1e87eb39c4fec9b726a2b1ea72ecee851a77e11e641a04f53c2a686fd60b4754083e5654520d0ab8133c91ca65f5a"

RPROVIDES:${PN} += "python3-fastparquet \
python3.11dist-fastparquet \
python311-fastparquet \
python3dist-fastparquet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-cramjam \
python311-fsspec \
python311-numpy \
python311-packaging \
python311-pandas"

inherit rpm
