SUMMARY = "The python pandas[performance] extra"
DESCRIPTION = "This package provides the [performance] extra for python-pandas \
 \
It is highly recommended to install this subpackage, as its dependencies \
provide speed improvements, especially when working with large data sets."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-performance-2.0.2-4.1.noarch.rpm"
RPM_HASH = "9cd46af0d2b8f3b59e5d043c155573a17709d3df5148c49feb94ba4745e8bd5ebfecc88b5792e0bec0a664ffae0cee5089fd1baa144abdf7bac5eecc53058774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-performance \
python311-pandas-performance"

RDEPENDS:${PN} += "python311-Bottleneck \
python311-numba \
python311-numexpr \
python311-pandas"

inherit rpm
