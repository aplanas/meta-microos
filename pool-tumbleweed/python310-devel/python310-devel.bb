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

RPM_NAME = "python310-devel-3.10.12-2.1.aarch64.rpm"
RPM_HASH = "e523cedf4b4517a0384a57a83d0adb538d26ebfdaaafacb4a04b1adff7cc4eeb5566b1bbe02220fc24945dbec459f1032b7869bf13c853aa2033ea2469b790ef"

RPROVIDES:${PN} += "pkgconfig-python-3.10 \
pkgconfig-python-3.10-embed \
python310-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-base"

inherit rpm
