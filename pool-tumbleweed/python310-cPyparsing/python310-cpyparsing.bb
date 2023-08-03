SUMMARY = "Cython implementation of PyParsing"
DESCRIPTION = "Cython implementation of PyParsing created for use in Coconut and Undebt."
LICENSE = "Apache-2.0"

PV = "2.4.7.2.1.2"

RPM_NAME = "python310-cPyparsing-2.4.7.2.1.2-1.1.aarch64.rpm"
RPM_HASH = "ca885bfeee62ee3a591d0124be49660e6e4ef7d0c4af31d852c1771851a764467e7c6fcd30df93ccc15018051011d30ff429c5d242d3fe60777e8d8cbcadc6aa"

RPROVIDES:${PN} += "python3.10dist-cpyparsing \
python310-cPyparsing \
python3dist-cpyparsing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
