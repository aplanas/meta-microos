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

RPM_NAME = "python310-Transplant-0.8.11-3.9.noarch.rpm"
RPM_HASH = "8e8e95ed1c31c85f89be61a68d9936c6560ef0e797669e6ca7cb52b62243041cfb79f7f3499eb7f5262143e2a3690b35fb229cc2cf49a36fb3996aba7879e3ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-transplant \
python310-Transplant \
python3dist-transplant"

RDEPENDS:${PN} += "python-abi \
python310-msgpack-python \
python310-numpy \
python310-pyzmq"

inherit rpm
