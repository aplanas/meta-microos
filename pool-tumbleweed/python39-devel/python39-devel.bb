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

RPM_NAME = "python39-devel-3.9.17-4.1.aarch64.rpm"
RPM_HASH = "d62114ff033f648800f8399a258c4c75093017e7be5ff27d9dfb9a3716084652040b1c8e4c0d329c5d73b3ecf8e9be0711242e26922fda54b21c8220d2c42782"

RPROVIDES:${PN} += "pkgconfig-python-3.9 \
pkgconfig-python-3.9-embed \
python39-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-base"

inherit rpm
