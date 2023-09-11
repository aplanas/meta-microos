SUMMARY = "The python pandas[performance] extra"
DESCRIPTION = "This package provides the [performance] extra for python-pandas \
 \
It is highly recommended to install this subpackage, as its dependencies \
provide speed improvements, especially when working with large data sets."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-performance-2.0.3-1.3.noarch.rpm"
RPM_HASH = "339f56314aed0fb2ed45f10427b0e6caf946264a73adb25b28af67a1b870e2461e7a27ffd8d030a13f877db177139fbe9a9393295385b622f17810f00f85783f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-performance"

RDEPENDS:${PN} += "python310-Bottleneck \
python310-numba \
python310-numexpr \
python310-pandas"

inherit rpm
