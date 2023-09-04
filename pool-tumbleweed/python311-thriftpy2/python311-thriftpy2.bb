SUMMARY = "Pure python implementation of Apache Thrift"
DESCRIPTION = "ThriftPy is a pure python implementation of Apache Thrift in a \
pythonic way."
LICENSE = "MIT"

PV = "0.4.16"

RPM_NAME = "python311-thriftpy2-0.4.16-2.1.aarch64.rpm"
RPM_HASH = "d9b8671bb8944cec0732a34f86068159e1e4b4b7efa6ef5cb338883526177a2dddc0c3493cdb4ef23e40f576f215bd9286a7128bac45b001f1c59073cdceeb43"

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
