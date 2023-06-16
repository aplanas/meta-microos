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

PV = "3.11.3"

RPM_NAME = "python311-devel-3.11.3-1.2.aarch64.rpm"
RPM_HASH = "da679079aeeb53fb32c153909bcd4520c201171aaedf2428f106a092f08cc5edcbae857845740dfa334727bd27bedca98d1d5b16760663589509cf9225872157"

RPROVIDES:${PN} += "pkgconfig-python-3.11 \
pkgconfig-python-3.11-embed \
python311-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-base"

inherit rpm
