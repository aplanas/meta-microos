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

PV = "3.10.13"

RPM_NAME = "python310-devel-3.10.13-1.1.aarch64.rpm"
RPM_HASH = "bf391bd4edd2d13c5ab3fe2672f01bb694c1c62d93f026de660abecd7f69d00d01a294b8cb61da7e6ec47c9d01648a44b0869aba266a122bc6fbb9c78a6863fa"

RPROVIDES:${PN} += "pkgconfig-python-3.10 \
pkgconfig-python-3.10-embed \
python310-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-base"

inherit rpm
