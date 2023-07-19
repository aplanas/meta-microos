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

PV = "3.12.0b4"

RPM_NAME = "python312-devel-3.12.0b4-1.1.aarch64.rpm"
RPM_HASH = "72dd49a6c0573315a072ce165d81256aa2373cacb6dd9e909c013ec47946f82a57b6e3795ad2a03e071dba00a055dcef36e93d714e4c0cb2addb96ebeb5280f8"

RPROVIDES:${PN} += "pkgconfig-python-3.12 \
pkgconfig-python-3.12-embed \
python312-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.12 \
/usr/bin/sh \
python-abi \
python312-base"

inherit rpm
