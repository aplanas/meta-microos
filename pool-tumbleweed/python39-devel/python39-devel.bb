SUMMARY = "Include Files and Libraries Mandatory for Building Python Modules"
DESCRIPTION = "The Python programming language's interpreter can be extended with \
dynamically loaded extensions and can be embedded in other programs. \
 \
This package contains header files, a static library, and development \
tools for building Python modules, extending the Python interpreter or \
embedding Python in applications. \
 \
This also includes the Python distutils, which were in the Python \
package up to version 2.2.2."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-devel-3.9.17-1.1.aarch64.rpm"
RPM_HASH = "42d894f1dcd1142eb4afdb289809e472dc9a39d12217d7c4070b5a8480872b3f0e3fb296318e8d431766923985db370b17f20fc1428c8e836ae56364a11a5114"

RPROVIDES:${PN} += "pkgconfig-python-3.9 \
pkgconfig-python-3.9-embed \
python39-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-base"

inherit rpm
