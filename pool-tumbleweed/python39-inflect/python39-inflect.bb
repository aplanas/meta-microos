SUMMARY = "Methods for working on numbers and nouns"
DESCRIPTION = "Correctly generate plurals, singular nouns, ordinals, indefinite articles; convert numbers to words."
LICENSE = "MIT"

PV = "6.0.4"

RPM_NAME = "python39-inflect-6.0.4-1.1.noarch.rpm"
RPM_HASH = "b00a1364f652aaccd52b69e6b04479ec47b540e67e8edc3de1f6fb5acaca644d093e96442b783970d96b701ce98f4c851416eae240ded4321b949af03c430a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(inflect) \
python39-inflect \
python3dist(inflect)"
RDEPENDS:${PN} += "python(abi) \
python39-pydantic \
python39-toml"

inherit rpm
