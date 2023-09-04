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

PV = "3.12.0rc1"

RPM_NAME = "python312-devel-3.12.0rc1-2.1.aarch64.rpm"
RPM_HASH = "2f1e349fd74982d6b719d4f09d50acaffe58de49253e003e7354afb198af91b7e887fa3c3b6a9d6bde01cc95ec388300aea2edad18baf3d9d4282e472c701fea"

RPROVIDES:${PN} += "pkgconfig-python-3.12 \
pkgconfig-python-3.12-embed \
python312-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.12 \
/usr/bin/sh \
python-abi \
python312-base"

inherit rpm
