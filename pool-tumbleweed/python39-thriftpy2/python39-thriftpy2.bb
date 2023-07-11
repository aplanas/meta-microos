SUMMARY = "Pure python implementation of Apache Thrift"
DESCRIPTION = "ThriftPy is a pure python implementation of Apache Thrift in a \
pythonic way."
LICENSE = "MIT"

PV = "0.4.16"

RPM_NAME = "python39-thriftpy2-0.4.16-1.5.aarch64.rpm"
RPM_HASH = "436141dc2cc9b5c3e9fa493955df67c041056926ad7087cc321d4b7c94e564bda0a1729c99d5797253bc528826f3cb7a2fa4bc268cac37d562c2d0bd77497331"

RPROVIDES:${PN} += "python3.9dist-thriftpy2 \
python39-thriftpy2 \
python3dist-thriftpy2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-ply \
python39-six"

inherit rpm
