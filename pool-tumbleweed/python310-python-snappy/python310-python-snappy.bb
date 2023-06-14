SUMMARY = "Python library for the snappy compression library"
DESCRIPTION = "Python library for the snappy compression library from Google."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python310-python-snappy-0.6.1-1.3.aarch64.rpm"
RPM_HASH = "890a4ab9fd8aaee28cb1b7e7907f842caa2936fd5a3948f01c0b1c5f4a899028690ca5a83e4aeb023f86d3691c03f4209c7e034dc31794adce03aa5822b4001b"

RPROVIDES:${PN} += "python3-python-snappy \
python3.10dist-python-snappy \
python310-python-snappy \
python3dist-python-snappy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsnappy.so.1 \
python-abi"

inherit rpm
