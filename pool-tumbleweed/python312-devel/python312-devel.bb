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

PV = "3.12.0b1"

RPM_NAME = "python312-devel-3.12.0b1-1.2.aarch64.rpm"
RPM_HASH = "a9ec84a22eb9ada466b03db33c059777085a4dc834032b68054f0b422b59fe3f5a41faf7b39f6d6615ae652cdb08d3798f1dfc97927053cce165f316c007fd96"

RPROVIDES:${PN} += "pkgconfig-python-3.12 \
pkgconfig-python-3.12-embed \
python312-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.12 \
/usr/bin/sh \
python-abi \
python312-base"

inherit rpm
