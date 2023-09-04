SUMMARY = "The python pandas[performance] extra"
DESCRIPTION = "This package provides the [performance] extra for python-pandas \
 \
It is highly recommended to install this subpackage, as its dependencies \
provide speed improvements, especially when working with large data sets."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-performance-2.0.3-1.2.noarch.rpm"
RPM_HASH = "76b6876dd4035b43d95754dd5f1dcd1e0e5a8222e59d8c57017c4467122972f841d9f943ac1d303bdb75354bf93e7648521869d560209313ceefaca3e245ad30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-performance"

RDEPENDS:${PN} += "python310-Bottleneck \
python310-numba \
python310-numexpr \
python310-pandas"

inherit rpm
