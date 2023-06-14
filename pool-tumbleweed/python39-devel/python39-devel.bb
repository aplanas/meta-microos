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

PV = "3.9.16"

RPM_NAME = "python39-devel-3.9.16-8.1.aarch64.rpm"
RPM_HASH = "ba0b4367813bd41cc4da60cb2c5a8426a8348602d128c20e9290e18296f86d0a9a41bfe0e3a6c1f2dacd4a52b4650345bf78f72c145c78e21d193f296822f2e9"

RPROVIDES:${PN} += "pkgconfig-python-3.9 \
pkgconfig-python-3.9-embed \
python39-devel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
/usr/bin/python3.9 \
python-abi \
python39-base"

inherit rpm
