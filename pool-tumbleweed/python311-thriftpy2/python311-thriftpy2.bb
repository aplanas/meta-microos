SUMMARY = "Pure python implementation of Apache Thrift"
DESCRIPTION = "ThriftPy is a pure python implementation of Apache Thrift in a \
pythonic way."
LICENSE = "MIT"

PV = "0.4.16"

RPM_NAME = "python311-thriftpy2-0.4.16-1.5.aarch64.rpm"
RPM_HASH = "a3a493db36bf635b3f939353d3bec13b10779874addb91cd63e0c8a66150bc5577dbe75be2ec1bf8537c2a5b5e42c9c691c44ad66fd6d8184a68eef381e962d3"

RPROVIDES:${PN} += "python3-thriftpy2 \
python3.11dist-thriftpy2 \
python311-thriftpy2 \
python3dist-thriftpy2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-ply \
python311-six"

inherit rpm
