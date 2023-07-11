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

RPM_NAME = "python311-devel-3.11.4-1.2.aarch64.rpm"
RPM_HASH = "08f3ddc19947474be355d1b9f4bf9885c90792b86f440080154ce9d7014748a3f2e09fe4c19318ec21eabf39dc00a7ea344dbacabb5cc56e4410375581f4a4a4"

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
