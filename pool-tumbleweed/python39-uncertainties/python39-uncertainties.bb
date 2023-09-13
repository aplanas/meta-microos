SUMMARY = "Uncertainties on the Quantities Involved (aka 'Error Propagation')"
DESCRIPTION = "'uncertainties' allows calculations such as (2±0.1)*2 = 4±0.2 to be \
performed transparently. Much more complex mathematical expressions \
involving numbers with uncertainties can also be evaluated directly."
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "python39-uncertainties-3.1.7-2.1.noarch.rpm"
RPM_HASH = "10c7a68bf3d6fd157deba0469c1279d0bed3d9ed4b0881ee18fa76c939777e33c45055f0d2fe3fb0d54862c76f1dfbd2d8c62a3b2a8ee48d84c4d5919ac948dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-uncertainties \
python39-uncertainties \
python3dist-uncertainties"

RDEPENDS:${PN} += "python-abi"

inherit rpm
