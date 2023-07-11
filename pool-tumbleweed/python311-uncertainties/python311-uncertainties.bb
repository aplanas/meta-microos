SUMMARY = "Uncertainties on the Quantities Involved (aka 'Error Propagation')"
DESCRIPTION = "'uncertainties' allows calculations such as (2±0.1)*2 = 4±0.2 to be \
performed transparently. Much more complex mathematical expressions \
involving numbers with uncertainties can also be evaluated directly."
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "python311-uncertainties-3.1.7-1.6.noarch.rpm"
RPM_HASH = "719805ed8908d759216a169d8f410d1d97ba68f541efbef0cf01030992b7974261b9729fdf7e816a17579039913877218071559f551aea700f11357ebd9d5cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uncertainties \
python3.11dist-uncertainties \
python311-uncertainties \
python3dist-uncertainties"

RDEPENDS:${PN} += "python-abi \
python311-future"

inherit rpm
