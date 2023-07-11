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

RPM_NAME = "python39-zope.interface-6.0-1.3.aarch64.rpm"
RPM_HASH = "9bdd4ead0b80ab3a03735bd4f51ade2e258dfbc630939f0605c8f4229f6ad8805e1efee87fb5eb6bb76c0c01add028b4b8231c9bfc3b700e36499590f34e0691"

RPROVIDES:${PN} += "python3.9dist-zope.interface \
python39-zope.interface \
python3dist-zope.interface"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-setuptools"

inherit rpm
