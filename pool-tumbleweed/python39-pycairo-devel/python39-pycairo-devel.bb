SUMMARY = "Development files for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the development files needed to build \
packages that depend on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.23.0"

RPM_NAME = "python39-pycairo-devel-1.23.0-2.1.aarch64.rpm"
RPM_HASH = "6d0642af719aeec0e968fcd7c25ba87a63aea6d56f33bf2525a000d554347c78acfa0d5ac5bc28727a4115b8e2d57ffc0d1dbea4e018393908b7025932af588c"

RPROVIDES:${PN} += "python39-cairo-devel \
python39-pycairo-devel"

RDEPENDS:${PN} += "python39-devel \
python39-pycairo \
python39-pycairo-common-devel"

inherit rpm
