SUMMARY = "Uncertainties on the Quantities Involved (aka 'Error Propagation')"
DESCRIPTION = "'uncertainties' allows calculations such as (2±0.1)*2 = 4±0.2 to be \
performed transparently. Much more complex mathematical expressions \
involving numbers with uncertainties can also be evaluated directly."
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "python310-uncertainties-3.1.7-1.6.noarch.rpm"
RPM_HASH = "2b094c255533dcc06b8bd0b72876cbda00b07cc72a686f6454fb3cd7650c69ef59b7b5328e1ae0d3d2c55cab77c9bbc3880867a68aa7da4c383b92d925be1c75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-uncertainties \
python310-uncertainties \
python3dist-uncertainties"

RDEPENDS:${PN} += "python-abi \
python310-future"

inherit rpm
