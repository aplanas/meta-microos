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

RPM_NAME = "python311-zope.interface-6.0-1.1.aarch64.rpm"
RPM_HASH = "19145c3498029fb7cfc4f16207c1303024f3c452707e64d3a413878a061c5189cdec85db71ba45d07e6480a7c36ce7aad7fcd3b6fae177c871f02f545823318a"

RPROVIDES:${PN} += "python3.11dist-zope.interface \
python311-zope.interface \
python3dist-zope.interface"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-setuptools"

inherit rpm
