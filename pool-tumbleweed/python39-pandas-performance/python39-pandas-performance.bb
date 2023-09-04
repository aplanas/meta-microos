SUMMARY = "The python pandas[performance] extra"
DESCRIPTION = "This package provides the [performance] extra for python-pandas \
 \
It is highly recommended to install this subpackage, as its dependencies \
provide speed improvements, especially when working with large data sets."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-performance-2.0.3-1.2.noarch.rpm"
RPM_HASH = "841c78bb588e0d5dd3d6dad823acbf14e3db134fce49e225f4c05869116ba7f04da1d03b796f5b9b8d9fefddfcb0e3d4818ce78c12b87cf0aafe0fedc240b187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-performance"

RDEPENDS:${PN} += "python39-Bottleneck \
python39-numba \
python39-numexpr \
python39-pandas"

inherit rpm
