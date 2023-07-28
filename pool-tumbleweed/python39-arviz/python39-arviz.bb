SUMMARY = "Exploratory analysis of Bayesian models"
DESCRIPTION = "ArviZ is a Python package for exploratory analysis of Bayesian models. Includes \
functions for posterior analysis, data storage, model checking, comparison and \
diagnostics."
LICENSE = "Apache-2.0"

PV = "0.16.0"

RPM_NAME = "python39-arviz-0.16.0-1.1.noarch.rpm"
RPM_HASH = "99c3736c701ab854795404eed34fe5dc4e832d8ebb04ef4347f75a760bb25f97ce89b7ff174b8f4b95b07eea3b20dd5515ab8b4e9b34c461b10ae02f782574b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-arviz \
python39-arviz \
python3dist-arviz"

RDEPENDS:${PN} += "python-abi \
python39-h5netcdf \
python39-matplotlib \
python39-numpy \
python39-packaging \
python39-pandas \
python39-scipy \
python39-setuptools \
python39-typing-extensions \
python39-xarray \
python39-xarray-einstats"

inherit rpm
