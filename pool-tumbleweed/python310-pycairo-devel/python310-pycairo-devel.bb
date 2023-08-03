SUMMARY = "Development files for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the development files needed to build \
packages that depend on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.24.0"

RPM_NAME = "python310-pycairo-devel-1.24.0-1.1.aarch64.rpm"
RPM_HASH = "bb1714a738bdc6579ebe57c18e3e8bbd7b52d89c93f92fe698955870a18967bc2f6226a0fd8fe66dd8c770a6261f3ec3964bcacd156969b6a9992060602bd37f"

RPROVIDES:${PN} += "python310-cairo-devel \
python310-pycairo-devel"

RDEPENDS:${PN} += "python310-devel \
python310-pycairo \
python310-pycairo-common-devel"

inherit rpm
