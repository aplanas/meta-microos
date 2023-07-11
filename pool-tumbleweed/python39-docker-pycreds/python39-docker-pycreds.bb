SUMMARY = "Python bindings for the Docker credentials store API"
DESCRIPTION = "This package contains the Python bindings for the Docker credentials \
store API."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python39-docker-pycreds-0.4.0-2.3.noarch.rpm"
RPM_HASH = "18d6fc64d8d971fbb3e6438cf6035aa188a6f818d1222ae6f1015e5b1dc36b1d560ec775de795aa8f5aa6db6d8e3ce924fb4bbc241e15095e11ea95c93b971d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-docker-pycreds \
python39-docker-pycreds \
python3dist-docker-pycreds"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
