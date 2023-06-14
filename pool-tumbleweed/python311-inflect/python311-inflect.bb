SUMMARY = "Methods for working on numbers and nouns"
DESCRIPTION = "Correctly generate plurals, singular nouns, ordinals, indefinite articles; convert numbers to words."
LICENSE = "MIT"

PV = "6.0.4"

RPM_NAME = "python311-inflect-6.0.4-1.1.noarch.rpm"
RPM_HASH = "ecb2c984568b347f3cf8f588632466bdaa4825d558421b9021a9dfe2206eae98c3361cff290b5f458c219a2c7d5abebef5f9750e47a42139bf4428908fb7718e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-inflect \
python311-inflect \
python3dist-inflect"

RDEPENDS:${PN} += "python-abi \
python311-pydantic \
python311-toml"

inherit rpm
