SUMMARY = "Methods for working on numbers and nouns"
DESCRIPTION = "Correctly generate plurals, singular nouns, ordinals, indefinite articles; convert numbers to words."
LICENSE = "MIT"

PV = "6.0.4"

RPM_NAME = "python39-inflect-6.0.4-1.3.noarch.rpm"
RPM_HASH = "48b1b06a6a3bf566a8c23831f843205afa0ef856db4af2449b9afd9dd1fccf5510c719d8f60af25d3ae599bcd5442f6b16a49a8156571e2777c18c785a55dc38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-inflect \
python39-inflect \
python3dist-inflect"

RDEPENDS:${PN} += "python-abi \
python39-pydantic \
python39-toml"

inherit rpm
