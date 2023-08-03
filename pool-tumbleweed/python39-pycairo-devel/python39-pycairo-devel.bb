SUMMARY = "Development files for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the development files needed to build \
packages that depend on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.24.0"

RPM_NAME = "python39-pycairo-devel-1.24.0-1.1.aarch64.rpm"
RPM_HASH = "f4fe59dfc4490a687818dc040612624f200b2fcdefa0da28bf6d7277345cf6d63f81df7a345446f2c47682387c44388986faf86fa380b8509a1f5187b1e56cdd"

RPROVIDES:${PN} += "python39-cairo-devel \
python39-pycairo-devel"

RDEPENDS:${PN} += "python39-devel \
python39-pycairo \
python39-pycairo-common-devel"

inherit rpm
