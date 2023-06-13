SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python39-lxml-4.9.2-7.1.aarch64.rpm"
RPM_HASH = "d1158474e54a10775bd2f40c980e7028f101585e132bdabe1b33e83a7a00dee0c0e7312daae55a0bb53bb7c6fff4adb78e0ab8ff77bcba2671f05d42a2e3fab8"

RPROVIDES:${PN} += "python3.9dist(lxml) \
python39-lxml \
python39-lxml(aarch-64) \
python3dist(lxml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libexslt.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit) \
python(abi) \
python39-cssselect"

inherit rpm
