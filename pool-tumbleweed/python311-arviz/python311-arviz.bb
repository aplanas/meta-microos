SUMMARY = "Exploratory analysis of Bayesian models"
DESCRIPTION = "ArviZ is a Python package for exploratory analysis of Bayesian models. Includes \
functions for posterior analysis, data storage, model checking, comparison and \
diagnostics."
LICENSE = "Apache-2.0"

PV = "0.15.1"

RPM_NAME = "python311-arviz-0.15.1-2.1.noarch.rpm"
RPM_HASH = "aa4f62430470f5b67e63a3c50ec7214a30ebd1dd7ff6aa9dbcd139bfb0581f87e36a3db651630ac9b249bdbb1336b475a6d3e1056ea8b4247984603bd9294f79"
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
