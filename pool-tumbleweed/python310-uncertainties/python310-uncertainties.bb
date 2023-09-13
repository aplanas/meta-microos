SUMMARY = "Uncertainties on the Quantities Involved (aka 'Error Propagation')"
DESCRIPTION = "'uncertainties' allows calculations such as (2±0.1)*2 = 4±0.2 to be \
performed transparently. Much more complex mathematical expressions \
involving numbers with uncertainties can also be evaluated directly."
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "python310-uncertainties-3.1.7-2.1.noarch.rpm"
RPM_HASH = "3135081a69e5fcc222ec82a41025ad4761acb9fd704f6b79ba3b601ec04f7323b9fa41b0a84569a4210ba1b2c739f04e19dc7916f8fe4dc939e0e4f9044a5b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-uncertainties \
python310-uncertainties \
python3dist-uncertainties"

RDEPENDS:${PN} += "python-abi"

inherit rpm
