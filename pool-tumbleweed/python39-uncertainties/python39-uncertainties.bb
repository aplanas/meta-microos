SUMMARY = "Uncertainties on the Quantities Involved (aka 'Error Propagation')"
DESCRIPTION = "'uncertainties' allows calculations such as (2±0.1)*2 = 4±0.2 to be \
performed transparently. Much more complex mathematical expressions \
involving numbers with uncertainties can also be evaluated directly."
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "python39-uncertainties-3.1.7-1.4.noarch.rpm"
RPM_HASH = "85d0d9082c59e353d3488d3bf139f7b0308e5955c394b7b49415c4ee64093afae1b545feeb900fc4eb482eb3a47f8fd7701073c6bd04f25dc299b87a9009a34d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-uncertainties \
python39-uncertainties \
python3dist-uncertainties"

RDEPENDS:${PN} += "python-abi \
python39-future"

inherit rpm
