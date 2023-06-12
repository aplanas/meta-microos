SUMMARY = "Methods for working on numbers and nouns"
DESCRIPTION = "Correctly generate plurals, singular nouns, ordinals, indefinite articles; convert numbers to words."
LICENSE = "MIT"

PV = "6.0.4"

RPM_NAME = "python310-inflect-6.0.4-1.1.noarch.rpm"
RPM_HASH = "f799bda051e76529cbae0e30c0b0a3a956494ac2feaa7a9767b95d0fb1f6aa291a59788656735fc7d9647ef9c6095c4eb935a78514ea1d6d7fc9f7fac496bb44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-inflect \
python3.10dist(inflect) \
python310-inflect \
python3dist(inflect)"
RDEPENDS:${PN} += "python(abi) \
python310-pydantic \
python310-toml"

inherit rpm
