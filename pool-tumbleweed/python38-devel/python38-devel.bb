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

PV = "3.8.18"

RPM_NAME = "python38-devel-3.8.18-1.1.aarch64.rpm"
RPM_HASH = "aa7bad9d41863860c313ed1859b67c9c35195131d0d5c2415a44d7ac5a1174c4411be6f3eec37893c647f39874345ed59ffb930aa0a5186b2711c0269f382384"

RPROVIDES:${PN} += "pkgconfig-python-3.8 \
pkgconfig-python-3.8-embed \
python38-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.8 \
/usr/bin/sh \
python-abi \
python38-base"

inherit rpm
