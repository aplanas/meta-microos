SUMMARY = "Headers for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the headers and development files needed to build \
packages that depend on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.23.0"

RPM_NAME = "python-pycairo-common-devel-1.23.0-2.1.aarch64.rpm"
RPM_HASH = "512acd79f69369022d8a4a33bf778d527f860ec2b55a3ad0392b0797e1f1ef5c2fc775e7f50c19f53ce274139611b4406435af29c2412e0ce948e2cbae2750f0"

RPROVIDES:${PN} += "pkgconfig(py3cairo) \
python-cairo-common-devel \
python-pycairo-common-devel \
python-pycairo-common-devel(aarch-64) \
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
pkgconfig(cairo)"

inherit rpm
