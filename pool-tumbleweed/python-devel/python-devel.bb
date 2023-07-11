SUMMARY = "Include Files and Libraries Mandatory for Building Python Modules"
DESCRIPTION = "The Python programming language's interpreter can be extended with \
dynamically loaded extensions and can be embedded in other programs. \
 \
This package contains header files, a static library, and development \
tools for building Python modules, extending the Python interpreter or \
embedding Python in applications."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-devel-2.7.18-36.1.aarch64.rpm"
RPM_HASH = "680fd411ff56768ff11146bf769c137d6d866cf5aabe7070ba1b5e248dd4c8bfc4026d67871d84ea79a17103c76b5d4399b90fcbd816df3f65fa918dd0e8bc2c"

RPROVIDES:${PN} += "pkgconfig-python \
pkgconfig-python-2.7 \
pkgconfig-python2 \
python-devel \
python-testsuite \
python2-devel \
python2-testsuite"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python \
/usr/bin/python2 \
/usr/bin/python2.7 \
/usr/bin/sh \
glibc-devel \
python \
python-abi \
python-base"

inherit rpm
