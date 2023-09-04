SUMMARY = "Pure python implementation of Apache Thrift"
DESCRIPTION = "ThriftPy is a pure python implementation of Apache Thrift in a \
pythonic way."
LICENSE = "MIT"

PV = "0.4.16"

RPM_NAME = "python310-thriftpy2-0.4.16-2.1.aarch64.rpm"
RPM_HASH = "87fbbe808906c2713569972974d42d57d76cf0e9a0eb58e22b976627958c364a1ff1c4966aabf7b0492653f0eca27c84133f57b22a5db61e00be6eaa13d40e10"

RPROVIDES:${PN} += "python3.10dist-thriftpy2 \
python310-thriftpy2 \
python3dist-thriftpy2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-ply \
python310-six"

inherit rpm
