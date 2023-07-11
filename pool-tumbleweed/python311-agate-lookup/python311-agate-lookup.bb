SUMMARY = "Remote lookup tables for agate"
DESCRIPTION = "Agate-lookup adds one-line access to lookup tables to agate."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python311-agate-lookup-0.3.2-1.1.noarch.rpm"
RPM_HASH = "4d6535a796065a6e5a5a57a845285fa1ad04e7357a5a597d4ef5e7e82ff2cd9aa523b5f8c36b6544f0200aec71e68c838a93982211fc098b693cec44a6ae51b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-lookup \
python3.11dist-agate-lookup \
python311-agate-lookup \
python3dist-agate-lookup"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-agate \
python311-requests"

inherit rpm
