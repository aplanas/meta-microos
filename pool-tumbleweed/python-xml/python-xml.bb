SUMMARY = "A Python XML Interface"
DESCRIPTION = "The expat module is a Python interface to the expat XML parser. Since \
Python2.x, it is part of the core Python distribution."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-xml-2.7.18-36.1.aarch64.rpm"
RPM_HASH = "f0fedc213bbc5104413ecf19a39e55e74adb2e723d52cdf089a0845bd141f1cd875251030832ef49df10185b099ffe17a976ad3318866e5bab0a356cea9d707d"

RPROVIDES:${PN} += "python-xml \
python2-xml \
pyxml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython2.7.so.1.0 \
python-abi \
python-base"

inherit rpm
