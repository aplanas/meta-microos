SUMMARY = "Interfaces for Python"
DESCRIPTION = "This package is intended to be independently reusable in any Python \
project. It is maintained by the Zope Toolkit project. \
 \
This package provides an implementation of object interfaces for Python. \
Interfaces are a mechanism for labeling objects as conforming to a given \
API or contract. So, this package can be considered as implementation of \
the Design By Contract methodology support in Python."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python310-zope.interface-6.0-1.1.aarch64.rpm"
RPM_HASH = "1d5c2e86e5573a658bfb53871473536231cb4ea6ca48c799b1c15516fe48a1ad35d6e341091f033558efb17124fe0fa068356d2311b7199386986870c08abb35"

RPROVIDES:${PN} += "python3-zope.interface \
python3.10dist(zope.interface) \
python310-zope.interface \
python310-zope.interface(aarch-64) \
python3dist(zope.interface)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python310-setuptools"

inherit rpm
