SUMMARY = "Exploratory analysis of Bayesian models"
DESCRIPTION = "ArviZ is a Python package for exploratory analysis of Bayesian models. Includes \
functions for posterior analysis, data storage, model checking, comparison and \
diagnostics."
LICENSE = "Apache-2.0"

PV = "0.15.1"

RPM_NAME = "python39-arviz-0.15.1-1.2.noarch.rpm"
RPM_HASH = "86a6a67589c3c21a2b717e09223caf14900fed3c49d820048ad8025fa33e7d569d98d4ceaf7efd1c7d8a60ff2f7c1b72bd14ce7c284ed250d0919d27eadc3520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(arviz) \
python39-arviz \
python3dist(arviz)"
RDEPENDS:${PN} += "python(abi) \
python39-h5netcdf \
python39-matplotlib \
python39-numpy \
python39-packaging \
python39-pandas \
python39-scipy \
python39-setuptools \
python39-typing_extensions \
python39-xarray \
python39-xarray-einstats"

inherit rpm
