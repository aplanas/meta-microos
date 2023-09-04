SUMMARY = "The python pandas[hdf5] extra"
DESCRIPTION = "This package provides the [hdf5] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-hdf5-2.0.3-1.2.noarch.rpm"
RPM_HASH = "97cbccc04d9116efbe5f0fbe5e255c6fd40f6e531ac2de471c21041118c7bd30ddc4b9701444dbc89f9f490ab0599e1dfb72148ca7d20bed7301cb0dd6d6c084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-hdf5"

RDEPENDS:${PN} += "python39-blosc \
python39-pandas \
python39-tables"

inherit rpm
