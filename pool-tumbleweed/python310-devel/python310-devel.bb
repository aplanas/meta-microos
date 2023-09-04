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

PV = "3.10.12"

RPM_NAME = "python310-devel-3.10.12-3.1.aarch64.rpm"
RPM_HASH = "4716a7595e1f627142d9c1b7bf0650b1012da75704ec3870783c29752b8bd13c94adbf99f28c7d5ef8845b86294e4857f8205f84cb9b8c7ccbaeb76b680a5048"

RPROVIDES:${PN} += "pkgconfig-python-3.10 \
pkgconfig-python-3.10-embed \
python310-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-base"

inherit rpm
