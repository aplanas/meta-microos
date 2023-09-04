SUMMARY = "Pure python implementation of Apache Thrift"
DESCRIPTION = "ThriftPy is a pure python implementation of Apache Thrift in a \
pythonic way."
LICENSE = "MIT"

PV = "0.4.16"

RPM_NAME = "python39-thriftpy2-0.4.16-2.1.aarch64.rpm"
RPM_HASH = "3551b052f4672c2134543059fe7a9babcc52c43e4449fb36bf13f19108fce00a2a79d2c9985321c040d77f74c09f7c97354c2a325c89838228bd0e33dce874d7"

RPROVIDES:${PN} += "python3.9dist-thriftpy2 \
python39-thriftpy2 \
python3dist-thriftpy2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-ply \
python39-six"

inherit rpm
