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

PV = "3.8.16"

RPM_NAME = "python38-devel-3.8.16-7.1.aarch64.rpm"
RPM_HASH = "faa0422a275735d2b0b5db932dd4be36e49ad54e28e457bcb6f7205bdbeee2cce95c34efb6695c027c500e4823e6b14ed90d1bc37aab805d620b540e61893984"

RPROVIDES:${PN} += "pkgconfig(python-3.8) \
pkgconfig(python-3.8-embed) \
python38-devel \
python38-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
/usr/bin/python3.8 \
python(abi) \
python38-base"

inherit rpm
