SUMMARY = "A Python XML Interface"
DESCRIPTION = "The expat module is a Python interface to the expat XML parser. Since \
Python2.x, it is part of the core Python distribution."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-xml-2.7.18-34.1.aarch64.rpm"
RPM_HASH = "184dd3802c186e75ce0152a9966485122d3a7224d926a2bbefc13940920e6fcd960a0ae19d1dae0dbd9238e8a09d39ffcf084c6088a54a63683fd3b6e957bc01"

RPROVIDES:${PN} += "python-xml \
python-xml(aarch-64) \
python2-xml \
pyxml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpython2.7.so.1.0()(64bit) \
python(abi) \
python-base"

inherit rpm
