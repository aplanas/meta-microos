SUMMARY = "Exploratory analysis of Bayesian models"
DESCRIPTION = "ArviZ is a Python package for exploratory analysis of Bayesian models. Includes \
functions for posterior analysis, data storage, model checking, comparison and \
diagnostics."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python310-arviz-0.16.1-1.1.noarch.rpm"
RPM_HASH = "2188fe7c25a203e399922ed7c91c42c01d42ca21a3eb7d4de5a71f0cc37e62323473bf899c9385c4feba5373bc7a8bc4572254a41e210412d726a2133e638008"
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
