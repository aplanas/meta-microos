SUMMARY = "Development files for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the development files needed to build \
packages that depend on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.23.0"

RPM_NAME = "python310-pycairo-devel-1.23.0-2.1.aarch64.rpm"
RPM_HASH = "d263b48cbf0758abb13d53888086eafd50639126b8bee008cb7b0cd763faa04d3051763fecf42bca72effe35b20ed2ad5cfae50c6d81a8ccc6a1127dd65453c5"

RPROVIDES:${PN} += "python3-cairo-devel \
python3-pycairo-devel \
python310-cairo-devel \
python310-pycairo-devel \
python310-pycairo-devel(aarch-64)"

RDEPENDS:${PN} += "python310-devel \
python310-pycairo \
python310-pycairo-common-devel"

inherit rpm
