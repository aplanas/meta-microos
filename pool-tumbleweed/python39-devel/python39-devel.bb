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

PV = "3.9.18"

RPM_NAME = "python39-devel-3.9.18-1.1.aarch64.rpm"
RPM_HASH = "ce1816c1ea606fc9b751df1a5bcb146f5942d435edfc0906f7a0cdff71961dd492660c0704a04c1430e6013b8a21ccf60e36724dfe0ee19ff57c42ab0645a026"

RPROVIDES:${PN} += "pkgconfig-python-3.9 \
pkgconfig-python-3.9-embed \
python39-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-base"

inherit rpm
