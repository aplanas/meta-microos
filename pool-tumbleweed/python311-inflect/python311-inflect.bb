SUMMARY = "Methods for working on numbers and nouns"
DESCRIPTION = "Correctly generate plurals, singular nouns, ordinals, indefinite articles; convert numbers to words."
LICENSE = "MIT"

PV = "6.0.4"

RPM_NAME = "python311-inflect-6.0.4-1.3.noarch.rpm"
RPM_HASH = "93e3572140c19cf34d738eac36e6a20aa025e101bba6a8478736d099fa233ca4d7a006cf3d25c88a2bd009be2cda86075fd1bc0104ea001ffaa0917d48eb1f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-inflect \
python3.11dist-inflect \
python311-inflect \
python3dist-inflect"

RDEPENDS:${PN} += "python-abi \
python311-pydantic \
python311-toml"

inherit rpm
