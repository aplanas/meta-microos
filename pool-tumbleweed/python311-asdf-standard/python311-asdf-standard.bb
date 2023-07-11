SUMMARY = "The ASDF Standard schemas"
DESCRIPTION = "The ASDF Standard schemas"
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python311-asdf-standard-1.0.3-1.5.noarch.rpm"
RPM_HASH = "ab25e7b2858b007f4dd0b89959f7c875248fb672c50d415dadffb5597d98465e04cbbf669c06a388991947d1f7dcf4ceb1d39ffd0cfa8b669549593a4c7afcb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-standard \
python3.11dist-asdf-standard \
python311-asdf-standard \
python3dist-asdf-standard"

RDEPENDS:${PN} += "python-abi"

inherit rpm
