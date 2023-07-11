SUMMARY = "Headers for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the headers and development files needed to build \
packages that depend on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.23.0"

RPM_NAME = "python-pycairo-common-devel-1.23.0-2.2.aarch64.rpm"
RPM_HASH = "78804eb98a929d02c4848b3c1e4fa64ad2d8b4e0c6f922cafa41cb09f96b1f024a60e4f7d6ccd33d659a05a330dd28a1c1b48d8cba153fa0141385d9dc966d93"

RPROVIDES:${PN} += "pkgconfig-py3cairo \
python-cairo-common-devel \
python-pycairo-common-devel \
python310-cairo-common-devel \
python310-cairo-devel \
python310-pycairo-common-devel \
python311-cairo-common-devel \
python311-cairo-devel \
python311-pycairo-common-devel \
python39-cairo-common-devel \
python39-cairo-devel \
python39-pycairo-common-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cairo-devel \
pkgconfig-cairo"

inherit rpm
