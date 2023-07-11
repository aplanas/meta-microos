SUMMARY = "Exploratory analysis of Bayesian models"
DESCRIPTION = "ArviZ is a Python package for exploratory analysis of Bayesian models. Includes \
functions for posterior analysis, data storage, model checking, comparison and \
diagnostics."
LICENSE = "Apache-2.0"

PV = "0.15.1"

RPM_NAME = "python39-arviz-0.15.1-2.1.noarch.rpm"
RPM_HASH = "5fc587ed6109804fc391206c4a89da85bf65f6c91c77b8806abfd3e9a2282a7a66226396685b47cfe99d88fbfbfa03778fe9ea11065d6d126f98daa9d570985d"
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
