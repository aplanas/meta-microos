SUMMARY = "The python pandas[feather] extra"
DESCRIPTION = "This package provides the [feather] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-feather-2.1.0-1.2.noarch.rpm"
RPM_HASH = "2cd4e525c275ba4021c664a0dbb11e481683451d74f90a66faed749049055b3caee8b06090a232641c64cdaf9f309c61ef7c54c4a4a01f5cdf1c1f7d2caa1762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-feather"

RDEPENDS:${PN} += "python310-pandas \
python310-pyarrow"

inherit rpm
