SUMMARY = "Hankel Transformations using method of Ogata 2005"
DESCRIPTION = "Hankel is a Python library to perform simple and accurate Hankel \
transformations using the method of Ogata 2005."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python39-hankel-1.2.1-2.5.noarch.rpm"
RPM_HASH = "54bad8159593ba7cf1084f9dea076fd7af3bda913bc449a121572bfa860f689d546111ba8a82e1c1b6e4869bac890cdc7b203ad83dbcda5d8d0a6d9710007a33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hankel \
python39-hankel \
python3dist-hankel"

RDEPENDS:${PN} += "python-abi \
python39-mpmath \
python39-numpy \
python39-scipy"

inherit rpm
