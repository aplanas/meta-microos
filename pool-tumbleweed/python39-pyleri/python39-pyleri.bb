SUMMARY = "Python Left-Right Parser"
DESCRIPTION = "Python Left-Right Parser."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "python39-pyleri-1.3.3-1.10.noarch.rpm"
RPM_HASH = "d68c946ead893465ca69b3f7a38c0a202c1fd4cbadaf1d081072e977beb57e0cf6cae0a0d5e66fb8aae57e6fa4d204ad82f58daec264112cfd1937e07d2a2f72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyleri \
python39-pyleri \
python3dist-pyleri"

RDEPENDS:${PN} += "python-abi"

inherit rpm
