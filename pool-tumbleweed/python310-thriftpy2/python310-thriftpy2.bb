SUMMARY = "Pure python implementation of Apache Thrift"
DESCRIPTION = "ThriftPy is a pure python implementation of Apache Thrift in a \
pythonic way."
LICENSE = "MIT"

PV = "0.4.16"

RPM_NAME = "python310-thriftpy2-0.4.16-1.5.aarch64.rpm"
RPM_HASH = "f79e1b2578e9c870a92e6a801baebe8932c7e4adfbe386e0687c81111ff3603c21b0b4f9ac20bebc411918573d92a5102f40adeb46507e039c7a8e44fbae2d77"

RPROVIDES:${PN} += "python3.10dist-thriftpy2 \
python310-thriftpy2 \
python3dist-thriftpy2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-ply \
python310-six"

inherit rpm
