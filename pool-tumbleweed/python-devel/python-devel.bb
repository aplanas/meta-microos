SUMMARY = "Include Files and Libraries Mandatory for Building Python Modules"
DESCRIPTION = "The Python programming language's interpreter can be extended with \
dynamically loaded extensions and can be embedded in other programs. \
 \
This package contains header files, a static library, and development \
tools for building Python modules, extending the Python interpreter or \
embedding Python in applications."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-devel-2.7.18-37.1.aarch64.rpm"
RPM_HASH = "4234fc9a31769d108a68be0b866ef9d0b1094cb57734ab3cb34b6ff5daeca271c56b715fdc3363c4a7eacfe8b83cf1231552fb493ae3134db4edc2debe3beff5"

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
