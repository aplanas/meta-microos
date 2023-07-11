SUMMARY = "Methods for working on numbers and nouns"
DESCRIPTION = "Correctly generate plurals, singular nouns, ordinals, indefinite articles; convert numbers to words."
LICENSE = "MIT"

PV = "6.0.4"

RPM_NAME = "python310-inflect-6.0.4-1.3.noarch.rpm"
RPM_HASH = "c31c932b24b4d1efdebdf1efce2b9beec91acb26eecc8e95b78ab5743abff95b12406fe8b9623c6adaefe91ddb013549e72d75e897dc256dd0d28a244f99916f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-inflect \
python310-inflect \
python3dist-inflect"

RDEPENDS:${PN} += "python-abi \
python310-pydantic \
python310-toml"

inherit rpm
