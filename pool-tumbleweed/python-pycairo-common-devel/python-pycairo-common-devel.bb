SUMMARY = "Headers for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the headers and development files needed to build \
packages that depend on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.24.0"

RPM_NAME = "python-pycairo-common-devel-1.24.0-1.1.aarch64.rpm"
RPM_HASH = "5444270dd8014f3f03dd4f6c7214362f07b6679e71c0aefc48a342cb0355e024853c4484ed11125272a3afe4797eb5a174de872162a4a2557cdd9d211f19a72f"

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
