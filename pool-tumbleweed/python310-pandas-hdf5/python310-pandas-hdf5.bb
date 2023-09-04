SUMMARY = "The python pandas[hdf5] extra"
DESCRIPTION = "This package provides the [hdf5] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-hdf5-2.0.3-1.2.noarch.rpm"
RPM_HASH = "36f984db75378a5babfde680a2684a6b3460b97afcac3c894cb15f55fa3066bb84cf1da3e6afbc6f7c03247d4b3b9e1a18ca6b8916f68476ed399f7971a102c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-hdf5"

RDEPENDS:${PN} += "python310-blosc \
python310-pandas \
python310-tables"

inherit rpm
