SUMMARY = "The python pandas[performance] extra"
DESCRIPTION = "This package provides the [performance] extra for python-pandas \
 \
It is highly recommended to install this subpackage, as its dependencies \
provide speed improvements, especially when working with large data sets."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-performance-2.1.0-1.2.noarch.rpm"
RPM_HASH = "2e7f444cb02bfe7bf80e171c1f38ea1fb5e5a5826d2bc67cf8d2544231731b7ef4620b6c32fa62354446c9991cfc06cb16f3cc0c8a42774f4b18e85ef5d82a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-performance \
python311-pandas-performance"

RDEPENDS:${PN} += "python311-Bottleneck \
python311-numba \
python311-numexpr \
python311-pandas"

inherit rpm
