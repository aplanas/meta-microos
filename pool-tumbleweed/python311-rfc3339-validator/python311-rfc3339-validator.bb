SUMMARY = "A pure python RFC3339 validator"
DESCRIPTION = "A pure python RFC3339 validator"
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python311-rfc3339-validator-0.1.4-3.3.noarch.rpm"
RPM_HASH = "00c2341d8e48c32a7deefa1e3b1f1b6ec39cb47f80dfb5ea6b03ca80e5d2711bb51be8c61243a544fd637c49ce2652a9a04e7f5a250b4610c115d645827ad6a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rfc3339-validator \
python3.11dist-rfc3339-validator \
python311-rfc3339-validator \
python3dist-rfc3339-validator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
