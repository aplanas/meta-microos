SUMMARY = "The python pandas[performance] extra"
DESCRIPTION = "This package provides the [performance] extra for python-pandas \
 \
It is highly recommended to install this subpackage, as its dependencies \
provide speed improvements, especially when working with large data sets."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-performance-2.0.3-1.3.noarch.rpm"
RPM_HASH = "3b255e58e422dc468e15b412b1469fb6ba6abcac5da70d0a744e1e34f705087747debf008d96e3dbf6f82f756a1225afb940a9af837dda18e0ad836d589a532e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-performance \
python311-pandas-performance"

RDEPENDS:${PN} += "python311-Bottleneck \
python311-numba \
python311-numexpr \
python311-pandas"

inherit rpm
