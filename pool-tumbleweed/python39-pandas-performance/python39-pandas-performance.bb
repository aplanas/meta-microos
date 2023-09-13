SUMMARY = "The python pandas[performance] extra"
DESCRIPTION = "This package provides the [performance] extra for python-pandas \
 \
It is highly recommended to install this subpackage, as its dependencies \
provide speed improvements, especially when working with large data sets."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-performance-2.1.0-1.2.noarch.rpm"
RPM_HASH = "98bc6718430853cc567e5fc826789ecacd410fdb042ab1b566e6c9a7dc3eb8d5c0cdbfb1ca35183b91316e1ddb10a74e237eeee10d3dd1bc421af95a897797b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-performance"

RDEPENDS:${PN} += "python39-Bottleneck \
python39-numba \
python39-numexpr \
python39-pandas"

inherit rpm
