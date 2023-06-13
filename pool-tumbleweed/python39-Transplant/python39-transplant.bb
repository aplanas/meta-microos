SUMMARY = "Python module for calling out to Matlab"
DESCRIPTION = "Transplant is a way of calling Matlab from Python. \
 \
Python lists are converted to cell arrays in Matlab, dicts are \
converted to Maps, and numpy ND-Arrays are converted to native \
Matlab matrices. \
 \
All Matlab functions and objects can be accessed from Python."
LICENSE = "BSD-3-Clause"

PV = "0.8.11"

RPM_NAME = "python39-Transplant-0.8.11-3.7.noarch.rpm"
RPM_HASH = "ca687b42ec3b7b373ca04b93239cc36a1c3b2317d20445887a15f7fa41f907a968ec30907ded4694f1d3c8a73decf2ee17cbbae1b73307f8aec0323e859017af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(transplant) \
python39-Transplant \
python3dist(transplant)"

RDEPENDS:${PN} += "python(abi) \
python39-msgpack-python \
python39-numpy \
python39-pyzmq"

inherit rpm
