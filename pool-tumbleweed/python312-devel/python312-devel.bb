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

PV = "3.12.0b3"

RPM_NAME = "python312-devel-3.12.0b3-1.2.aarch64.rpm"
RPM_HASH = "b48bd37ee534b2ee241ea83b587fa8f3295d6ad8679ea6f2a5083eb21498852188e98918f288c86018d996b63a989ea224cba79089f2100af402f98ac8896614"

RPROVIDES:${PN} += "pkgconfig-python-3.12 \
pkgconfig-python-3.12-embed \
python312-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.12 \
/usr/bin/sh \
python-abi \
python312-base"

inherit rpm
