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

RPM_NAME = "python311-zope.interface-6.0-1.3.aarch64.rpm"
RPM_HASH = "2deaf6c3d835e10fa8711e5e30e42eb045358d1f7c05d9a58a42ff28dc4cadaec2afcc7e0abeb5f31a7f430416cfcbec34f35607d236c20d092baa911eebe186"

RPROVIDES:${PN} += "python3-zope.interface \
python3.11dist-zope.interface \
python311-zope.interface \
python3dist-zope.interface"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-setuptools"

inherit rpm
