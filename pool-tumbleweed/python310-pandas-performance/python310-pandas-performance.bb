SUMMARY = "The python pandas[performance] extra"
DESCRIPTION = "This package provides the [performance] extra for python-pandas \
 \
It is highly recommended to install this subpackage, as its dependencies \
provide speed improvements, especially when working with large data sets."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-performance-2.1.0-1.2.noarch.rpm"
RPM_HASH = "2b8d55c7d650b4dd619771376a6c00c06af03c6bd3a25ad923ec8bd5adbcaf18c5168d0a76fd41a5c0fb8de5b71c45301b9fb97cdb54bde98f00c149078c4212"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-performance"

RDEPENDS:${PN} += "python310-Bottleneck \
python310-numba \
python310-numexpr \
python310-pandas"

inherit rpm
