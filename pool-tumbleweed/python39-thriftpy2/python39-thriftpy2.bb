SUMMARY = "Pure python implementation of Apache Thrift"
DESCRIPTION = "ThriftPy is a pure python implementation of Apache Thrift in a \
pythonic way."
LICENSE = "MIT"

PV = "0.4.16"

RPM_NAME = "python39-thriftpy2-0.4.16-1.4.aarch64.rpm"
RPM_HASH = "777ba6b100e8c491e3f95bc8ab2f5b81fddce4ef9de8274d4f7985b7d7a150933dd796ef1de05ca2acb36dab1338bed9f3ec95f270e512a98dab56167055d64e"

RPROVIDES:${PN} += "python3.9dist-thriftpy2 \
python39-thriftpy2 \
python3dist-thriftpy2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-ply \
python39-six"

inherit rpm
