SUMMARY = "Python port of material-color-utilities used for Material You colors"
DESCRIPTION = "Python port of material-color-utilities used for Material You colors."
LICENSE = "Apache-2.0"

PV = "0.1.5"

RPM_NAME = "python39-material-color-utilities-python-0.1.5-1.5.noarch.rpm"
RPM_HASH = "fdfd3c4c521cd7b21f9d94408d8787e3060ca1c48d18e611e7d203c1d0a05056c3eb167f56b9336a97006d06bb59de8730ccb94f9118d2d0be496125c158ea3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-material-color-utilities-python \
python39-material-color-utilities-python \
python3dist-material-color-utilities-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
