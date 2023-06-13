SUMMARY = "Headers for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the headers and development files needed to build \
packages that depen on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.18.1"

RPM_NAME = "python2-pycairo-common-devel-1.18.1-5.14.aarch64.rpm"
RPM_HASH = "73a4310601093cd7f7fb1cd88602d10f8cc51436da9127f97733726f03feff816fd38304002234e9af175793e1851c4a5e173959dc84423a20f19caa63c266cb"

RPROVIDES:${PN} += "python-cairo-common-devel \
python-pycairo-common-devel \
python2-cairo-common-devel \
python2-pycairo-common-devel \
python2-pycairo-common-devel(aarch-64)"

RDEPENDS:${PN} += "cairo-devel"

inherit rpm
