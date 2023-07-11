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

PV = "3.10.12"

RPM_NAME = "python310-devel-3.10.12-1.2.aarch64.rpm"
RPM_HASH = "25879afe7423fd8e594295ca57f8d92ad1952cb58e5a0e24a5314bc7854d96f9f93e083ce4db47ca7987d3c1db4c3a33aec842f540fd55f548c82ebf463b1866"

RPROVIDES:${PN} += "pkgconfig-python-3.10 \
pkgconfig-python-3.10-embed \
python310-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-base"

inherit rpm
