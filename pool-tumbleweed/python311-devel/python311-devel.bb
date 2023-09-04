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

PV = "3.11.4"

RPM_NAME = "python311-devel-3.11.4-3.1.aarch64.rpm"
RPM_HASH = "81e3e5b3907a7e3fde5344af26397f5a77288b8726fba70cad8eb79bc3e5c53a94ee6e42a9c17543bb5827e46bb9109efaddc89b5ae7fda0efe83335bdfb05b9"

RPROVIDES:${PN} += "libpython3.so \
pkgconfig-python-3.11 \
pkgconfig-python-3.11-embed \
pkgconfig-python3 \
pkgconfig-python3-embed \
python3-devel \
python311-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
/usr/bin/python3.11 \
/usr/bin/sh \
libc.so.6 \
libpython3.11.so.1.0 \
python-abi \
python311-base"

inherit rpm
