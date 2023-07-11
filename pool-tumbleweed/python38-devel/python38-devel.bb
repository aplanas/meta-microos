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

RPM_NAME = "python38-devel-3.8.17-1.2.aarch64.rpm"
RPM_HASH = "f97f042bf9f63070c304e4916cd1fd600a06a8b683d5f49efb6aaf579c590beadf06fa600ec61ec9f2dec2a9fe522f5c3b8faddf1ce42b74cca536ec2b75d960"

RPROVIDES:${PN} += "pkgconfig-python-3.8 \
pkgconfig-python-3.8-embed \
python38-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.8 \
/usr/bin/sh \
python-abi \
python38-base"

inherit rpm
