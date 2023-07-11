SUMMARY = "Python library for run time variable type checker"
DESCRIPTION = "typepy is a Python library for variable type checker/validator/converter at run time."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-typepy-1.3.0-2.10.noarch.rpm"
RPM_HASH = "19ad0c4610f8845e59b844ec4a13e16f353487bba6e2691b1bdad082ef5df22a75cca14afd1284a4e8d416e0e49debae0f9397b5f57b308549604d1d60aabe13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-typepy \
python39-typepy \
python3dist-typepy"

RDEPENDS:${PN} += "python-abi \
python39-mbstrdecoder"

inherit rpm
