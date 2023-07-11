SUMMARY = "Development files for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the development files needed to build \
packages that depend on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.23.0"

RPM_NAME = "python39-pycairo-devel-1.23.0-2.2.aarch64.rpm"
RPM_HASH = "14460a2e8f78ed8d85a2110860a07919984bc0c7be2feb540cf881073f7c62fc335967584dda9209fadb428d13fe8fc3008c063498bc513e69c843320d195f69"

RPROVIDES:${PN} += "python39-cairo-devel \
python39-pycairo-devel"

RDEPENDS:${PN} += "python39-devel \
python39-pycairo \
python39-pycairo-common-devel"

inherit rpm
