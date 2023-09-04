SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.25.2"

RPM_NAME = "python311-numpy-devel-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "941ca863cf56ff0dfa05204ca8da0664a9d5e92ad82cc26d947554647f8aeb4cffac06b30d0d33f3dd2e5284f1fdd41e7954d3ff2f34131072ddb9eb0eefe16f"

RPROVIDES:${PN} += "python3-numpy-devel \
python311-numpy-devel"

RDEPENDS:${PN} += "blas-devel \
cblas-devel \
lapack-devel \
python-abi \
python311-devel \
python311-numpy"

inherit rpm
