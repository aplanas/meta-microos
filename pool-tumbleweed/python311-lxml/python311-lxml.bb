SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python311-lxml-4.9.2-7.1.aarch64.rpm"
RPM_HASH = "8466401ace19e8c74e37799ba5acc8b3aa722593db490fa76c5220fea387861a5abc1a9b137b3cd835b612a15ceadd691aadc7c70e641ce1f1de1fe2a42f74b3"

RPROVIDES:${PN} += "python3.11dist(lxml) \
python311-lxml \
python311-lxml(aarch-64) \
python3dist(lxml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libexslt.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit) \
python(abi) \
python311-cssselect"

inherit rpm
