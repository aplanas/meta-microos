SUMMARY = "Uncertainties on the Quantities Involved (aka 'Error Propagation')"
DESCRIPTION = "'uncertainties' allows calculations such as (2±0.1)*2 = 4±0.2 to be \
performed transparently. Much more complex mathematical expressions \
involving numbers with uncertainties can also be evaluated directly."
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "python311-uncertainties-3.1.7-2.1.noarch.rpm"
RPM_HASH = "973dcb6d86b380f154c2cd54a9f5e11d97f90d4e122d6e3a70ffcb588535a3177ec6b4b2858251b5805a0d1f5ce6915d00d0e6d6aba9cdd6009dae66d354c012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uncertainties \
python3.11dist-uncertainties \
python311-uncertainties \
python3dist-uncertainties"

RDEPENDS:${PN} += "python-abi"

inherit rpm
