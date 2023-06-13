SUMMARY = "Pure python implementation of Apache Thrift"
DESCRIPTION = "ThriftPy is a pure python implementation of Apache Thrift in a \
pythonic way."
LICENSE = "MIT"

PV = "0.4.16"

RPM_NAME = "python310-thriftpy2-0.4.16-1.4.aarch64.rpm"
RPM_HASH = "61c4d824255caabf7aa79c6256c5f2cd7e31ec8558355e9f06d559ea167f20fbcdd04926f8e8cd61c55d6e1d3bb8a7c5c42a2b4198b9841dff8bb6786885406a"

RPROVIDES:${PN} += "python3-thriftpy2 \
python3.10dist(thriftpy2) \
python310-thriftpy2 \
python310-thriftpy2(aarch-64) \
python3dist(thriftpy2)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-ply \
python310-six"

inherit rpm
