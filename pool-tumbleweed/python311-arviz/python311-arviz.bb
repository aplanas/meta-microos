SUMMARY = "Exploratory analysis of Bayesian models"
DESCRIPTION = "ArviZ is a Python package for exploratory analysis of Bayesian models. Includes \
functions for posterior analysis, data storage, model checking, comparison and \
diagnostics."
LICENSE = "Apache-2.0"

PV = "0.16.0"

RPM_NAME = "python311-arviz-0.16.0-1.1.noarch.rpm"
RPM_HASH = "ffb9219da98ad51c11c382030cd7ef8ed006dab9e5fe457aa8a253d8bace0a26d469ca6b2ad8fce8d489cf7c27c7038fc56d49930168a4b5a9bdfc2b7f15c414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arviz \
python3.11dist-arviz \
python311-arviz \
python3dist-arviz"

RDEPENDS:${PN} += "python-abi \
python311-h5netcdf \
python311-matplotlib \
python311-numpy \
python311-packaging \
python311-pandas \
python311-scipy \
python311-setuptools \
python311-typing-extensions \
python311-xarray \
python311-xarray-einstats"

inherit rpm
