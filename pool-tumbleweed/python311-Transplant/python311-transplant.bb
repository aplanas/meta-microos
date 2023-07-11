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

RPM_NAME = "python311-Transplant-0.8.11-3.9.noarch.rpm"
RPM_HASH = "837f3de1d2ec2a76a738f40c89cb9334f6c252a412c4d5b471f9fe5a1fdbb1c4168a78928bdbdd701a4ce58761bb86000f75a18741ac5c35736149c9b89d39b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Transplant \
python3.11dist-transplant \
python311-Transplant \
python3dist-transplant"

RDEPENDS:${PN} += "python-abi \
python311-msgpack-python \
python311-numpy \
python311-pyzmq"

inherit rpm
