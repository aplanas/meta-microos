SUMMARY = "Development files for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the development files needed to build \
packages that depen on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.18.1"

RPM_NAME = "python2-pycairo-devel-1.18.1-5.14.aarch64.rpm"
RPM_HASH = "7a5c0f8ca0e90b0a92c4b2bddf5b3bff3212657eb3363c7bff46e7cc15be33cff9a856d412dd8fea7bef442762c7278a61d591014f84270a3c929e505f4e8628"

RPROVIDES:${PN} += "pkgconfig(pycairo) \
python-cairo-devel \
python2-cairo-devel \
python2-pycairo-devel \
python2-pycairo-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(cairo) \
python-devel \
python2-pycairo \
python2-pycairo-common-devel"

inherit rpm
