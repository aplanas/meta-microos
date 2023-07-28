SUMMARY = "Exploratory analysis of Bayesian models"
DESCRIPTION = "ArviZ is a Python package for exploratory analysis of Bayesian models. Includes \
functions for posterior analysis, data storage, model checking, comparison and \
diagnostics."
LICENSE = "Apache-2.0"

PV = "0.16.0"

RPM_NAME = "python310-arviz-0.16.0-1.1.noarch.rpm"
RPM_HASH = "88a89332d3658c482f263662f89b7d9167cd31dafc0b689e64b0bad685a8873a9379f75a00297fcc627ce2cfb2bc82cf78f4b4766f0bf727880bd0ec5589a8de"
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
