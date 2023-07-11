SUMMARY = "Development files for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the development files needed to build \
packages that depend on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.23.0"

RPM_NAME = "python311-pycairo-devel-1.23.0-2.2.aarch64.rpm"
RPM_HASH = "f9798a0fbea47913c425c4f895a0e8ea07e766fc863ba69d03f0b6b49faf1e84ca6a61312882f45442be1ce7e2dfc0dda6af91871157a28975da15471d3ae1f2"

RPROVIDES:${PN} += "python3-cairo-devel \
python3-pycairo-devel \
python311-cairo-devel \
python311-pycairo-devel"

RDEPENDS:${PN} += "python311-devel \
python311-pycairo \
python311-pycairo-common-devel"

inherit rpm
