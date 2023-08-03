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

RPM_NAME = "python39-devel-3.9.17-3.1.aarch64.rpm"
RPM_HASH = "e97ac6e6f353c8922cc9916b3e7b4c39337bd85e51773e84dd07cb510224b84ef91ba0c39f63013354cfa6f0e79bfe9f63f4f79db3cde94e86884f6b944783eb"

RPROVIDES:${PN} += "pkgconfig-python-3.9 \
pkgconfig-python-3.9-embed \
python39-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-base"

inherit rpm
