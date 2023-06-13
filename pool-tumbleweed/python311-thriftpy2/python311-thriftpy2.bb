SUMMARY = "Pure python implementation of Apache Thrift"
DESCRIPTION = "ThriftPy is a pure python implementation of Apache Thrift in a \
pythonic way."
LICENSE = "MIT"

PV = "0.4.16"

RPM_NAME = "python311-thriftpy2-0.4.16-1.4.aarch64.rpm"
RPM_HASH = "84fda8013b0e5179d3e2936f0a53e5f4cb964e0e4ca5dee10520bddf88317968a42230957cf2c602077e72cadfc663bdb9c77dc1b1756c45a6660128d55c3320"

RPROVIDES:${PN} += "python3.11dist(thriftpy2) \
python311-thriftpy2 \
python311-thriftpy2(aarch-64) \
python3dist(thriftpy2)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python311-ply \
python311-six"

inherit rpm
