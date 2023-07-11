SUMMARY = "The python pandas[hdf5] extra"
DESCRIPTION = "This package provides the [hdf5] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-hdf5-2.0.2-4.1.noarch.rpm"
RPM_HASH = "942c596b06e0f0e6b9d7e6e01b2e10c56840eb0dd82dbf50b43098a49c3081ad05a9200a04100ade7f50bdcb68df6803d3ca5fea6381437ae3c7b5723e1a3523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-hdf5"

RDEPENDS:${PN} += "python39-blosc \
python39-pandas \
python39-tables"

inherit rpm
