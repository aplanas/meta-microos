SUMMARY = "The python pandas[hdf5] extra"
DESCRIPTION = "This package provides the [hdf5] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-hdf5-2.0.3-1.3.noarch.rpm"
RPM_HASH = "8ff6d4551e4e6104ae66e797033e1862629e9412f33d7c72c5bdc549387d0ab7948c15e31da4ec133a04511cf89995f14d9c56caf0cca317e70c1eddc3e1b65b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-hdf5 \
python311-pandas-hdf5"

RDEPENDS:${PN} += "python311-blosc \
python311-pandas \
python311-tables"

inherit rpm
