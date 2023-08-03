SUMMARY = "Development files for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the development files needed to build \
packages that depend on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.24.0"

RPM_NAME = "python311-pycairo-devel-1.24.0-1.1.aarch64.rpm"
RPM_HASH = "d0eca9caa41bfa3a9c7aa10f392c985996d8b191377acb9e0f07fa63342527b96e852d75cf6fc3fb55eeabe1a3994695b86757aa4419cb83e9e5ee2a035ce806"

RPROVIDES:${PN} += "python3-cairo-devel \
python3-pycairo-devel \
python311-cairo-devel \
python311-pycairo-devel"

RDEPENDS:${PN} += "python311-devel \
python311-pycairo \
python311-pycairo-common-devel"

inherit rpm
