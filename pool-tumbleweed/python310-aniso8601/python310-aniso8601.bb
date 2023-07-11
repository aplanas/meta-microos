SUMMARY = "A library for parsing ISO 8601 strings"
DESCRIPTION = "aniso8601 is a Python library for parsing date strings \
in ISO 8601 format into datetime format."
LICENSE = "BSD-3-Clause"

PV = "9.0.1"

RPM_NAME = "python310-aniso8601-9.0.1-2.3.noarch.rpm"
RPM_HASH = "77aba6e7d64abc2ed7da794f5b4fc4610fc87c7b85c1c2c3a405462fc6efec4991d8bd8c639ff0f55ac3bae683c1421bbea01df69409c6ed256b4535f7bf99a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aniso8601 \
python310-aniso8601 \
python3dist-aniso8601"

RDEPENDS:${PN} += "python-abi"

inherit rpm
