SUMMARY = "Include Files and Libraries Mandatory for Building Python Modules"
DESCRIPTION = "The Python programming language's interpreter can be extended with \
dynamically loaded extensions and can be embedded in other programs. \
 \
This package contains header files, a static library, and development \
tools for building Python modules, extending the Python interpreter or \
embedding Python in applications."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-devel-2.7.18-34.1.aarch64.rpm"
RPM_HASH = "833f90614660614ed36a0f055d3723db523a82ddd9326079229798284700d03eeaf8acbb3271cbef271993589dd2c740fc257262616bda2fbb93137a11c7d39a"

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
