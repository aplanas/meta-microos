SUMMARY = "The python pandas[hdf5] extra"
DESCRIPTION = "This package provides the [hdf5] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-hdf5-2.0.2-4.1.noarch.rpm"
RPM_HASH = "dd794b9f0c057c2bb995ece0f249beddb66564dd00db3cdccf53a08cef5adc5cd4ff292d130c1d8782f914bcd78b6c8cd26712faaa931aba383c4c67c51ff882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-hdf5"

RDEPENDS:${PN} += "python310-blosc \
python310-pandas \
python310-tables"

inherit rpm
