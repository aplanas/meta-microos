SUMMARY = "Exploratory analysis of Bayesian models"
DESCRIPTION = "ArviZ is a Python package for exploratory analysis of Bayesian models. Includes \
functions for posterior analysis, data storage, model checking, comparison and \
diagnostics."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python39-arviz-0.16.1-1.1.noarch.rpm"
RPM_HASH = "80d0c15e113f6e7fb606a6adb700daab2d09d0b31f1545f9690b65a22f21b5e35f4ee58a103410b324b69316c1080aed576665f1272eb37f627f7235ed77c410"
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
