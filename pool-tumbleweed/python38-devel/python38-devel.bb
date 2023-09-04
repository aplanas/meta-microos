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

PV = "3.8.17"

RPM_NAME = "python38-devel-3.8.17-2.1.aarch64.rpm"
RPM_HASH = "14fa2b7380e3917badf9af619eace6e82df7542a42137febbbee72f6604773d5b2d60d84be595d36c59f7ecbe4d83998162b8555b60c583f0b6d35a9db9f6f11"

RPROVIDES:${PN} += "pkgconfig-python-3.8 \
pkgconfig-python-3.8-embed \
python38-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.8 \
/usr/bin/sh \
python-abi \
python38-base"

inherit rpm
