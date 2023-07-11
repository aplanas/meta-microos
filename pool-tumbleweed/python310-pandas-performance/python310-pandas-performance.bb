SUMMARY = "The python pandas[performance] extra"
DESCRIPTION = "This package provides the [performance] extra for python-pandas \
 \
It is highly recommended to install this subpackage, as its dependencies \
provide speed improvements, especially when working with large data sets."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-performance-2.0.2-4.1.noarch.rpm"
RPM_HASH = "01dd8c16d47fd89f0dd9791326943954aaa2f21b391eac59216b09c8c6399cc4d5833fad0f1a39e9a9c2e9f4bae1ac1b304e0451d0c13c7afa9044f4d28d26d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-performance"

RDEPENDS:${PN} += "python310-Bottleneck \
python310-numba \
python310-numexpr \
python310-pandas"

inherit rpm
