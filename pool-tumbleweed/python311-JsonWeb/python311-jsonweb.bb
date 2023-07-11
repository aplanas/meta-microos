SUMMARY = "Add JSON (de)serialization to your python objects"
DESCRIPTION = "Quickly add json serialization and deserialization \
to your python classes."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "python311-JsonWeb-0.8.2-6.3.noarch.rpm"
RPM_HASH = "73198871d447baef27f9330e1f480528cd58e05b34064d70feba719e058b7f0c654f60c24a806401a32eb67d57077fb0146295e05e29635021abac1813c649f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-JsonWeb \
python3.11dist-jsonweb \
python311-JsonWeb \
python3dist-jsonweb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
