SUMMARY = "Development files for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the development files needed to build \
packages that depend on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.23.0"

RPM_NAME = "python310-pycairo-devel-1.23.0-2.2.aarch64.rpm"
RPM_HASH = "b45286e072bc0dde1050a8d8d87a595c0b3f2e86de41988f238a398d4fde4a9bcd40833d0b415b9c3e745e014ec7f6d0bf5e5dc56dc14c6bfd6201c69a23a34e"

RPROVIDES:${PN} += "python310-cairo-devel \
python310-pycairo-devel"

RDEPENDS:${PN} += "python310-devel \
python310-pycairo \
python310-pycairo-common-devel"

inherit rpm
