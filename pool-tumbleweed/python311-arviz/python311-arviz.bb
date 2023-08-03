SUMMARY = "Exploratory analysis of Bayesian models"
DESCRIPTION = "ArviZ is a Python package for exploratory analysis of Bayesian models. Includes \
functions for posterior analysis, data storage, model checking, comparison and \
diagnostics."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python311-arviz-0.16.1-1.1.noarch.rpm"
RPM_HASH = "2337dcef03913fd0f392ef42b582fcd4ab4fa11bd6e9a2fdf7d2a964a6134a50d163beb732509898cd286fb41f8e5de73b61433cf7c5997b0d3d5fd14758e5a5"
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
