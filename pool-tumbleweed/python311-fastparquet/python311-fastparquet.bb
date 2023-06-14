SUMMARY = "Python support for Parquet file format"
DESCRIPTION = "This is a Python implementation of the parquet format \
for integrating it into python-based Big Data workflows."
LICENSE = "Apache-2.0"

PV = "2023.4.0"

RPM_NAME = "python311-fastparquet-2023.4.0-1.1.aarch64.rpm"
RPM_HASH = "181fbdeca88e1207b26f9326c88be13e4ec22dfa8210d491573d55b9203b40526594dc03f64aa1a3cc9c289713f74715f083f89b4eefc6c53a3322493acae2c8"

RPROVIDES:${PN} += "python3.11dist-fastparquet \
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
