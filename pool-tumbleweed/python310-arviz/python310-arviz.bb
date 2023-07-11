SUMMARY = "Exploratory analysis of Bayesian models"
DESCRIPTION = "ArviZ is a Python package for exploratory analysis of Bayesian models. Includes \
functions for posterior analysis, data storage, model checking, comparison and \
diagnostics."
LICENSE = "Apache-2.0"

PV = "0.15.1"

RPM_NAME = "python310-arviz-0.15.1-2.1.noarch.rpm"
RPM_HASH = "e536288ea71218f17e4b13a6bde2a4f62b8d92aaf7b4a0e98f33a1a5132946ea47a9ed0ea4649f020e60d15d7a6048a8cfd6da8353db4bb70bd2a37c666ec089"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-arviz \
python310-arviz \
python3dist-arviz"

RDEPENDS:${PN} += "python-abi \
python310-h5netcdf \
python310-matplotlib \
python310-numpy \
python310-packaging \
python310-pandas \
python310-scipy \
python310-setuptools \
python310-typing-extensions \
python310-xarray \
python310-xarray-einstats"

inherit rpm
