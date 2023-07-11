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

RPM_NAME = "python310-zope.interface-6.0-1.3.aarch64.rpm"
RPM_HASH = "64cb12c634dd35897c93855c8e624b05ad9cbbeda259a0779126209745c14a7ad025324a99a69d164f8cf1fe343d8aae9270b85f738ec7039c9635dcaa0a2462"

RPROVIDES:${PN} += "python3.10dist-zope.interface \
python310-zope.interface \
python3dist-zope.interface"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-setuptools"

inherit rpm
