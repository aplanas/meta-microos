SUMMARY = "Hankel Transformations using method of Ogata 2005"
DESCRIPTION = "Hankel is a Python library to perform simple and accurate Hankel \
transformations using the method of Ogata 2005."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python311-hankel-1.2.1-2.5.noarch.rpm"
RPM_HASH = "93cfc58574b47a1d5a886e6b4d713fe3f6689a4ff2172d9281f11aa8186ee454d252cd1976016e7cf03ff9437756b29cf52ba2cfbb2555274d3aa29e4554dadf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hankel \
python3.11dist-hankel \
python311-hankel \
python3dist-hankel"

RDEPENDS:${PN} += "python-abi \
python311-mpmath \
python311-numpy \
python311-scipy"

inherit rpm
