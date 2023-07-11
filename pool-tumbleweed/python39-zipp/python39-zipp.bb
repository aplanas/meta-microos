SUMMARY = "Pathlib-compatible object wrapper for zip files"
DESCRIPTION = "A pathlib-compatible Zipfile object wrapper."
LICENSE = "MIT"

PV = "3.15.0"

RPM_NAME = "python39-zipp-3.15.0-2.3.noarch.rpm"
RPM_HASH = "204781b91759fee826ffee3b65cb12291846f1ff938dceddcf4cc01985c90669271f821d2c2fe12a6b9e5eade2fe968b32afe667412ccaa772d895655184d67c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zipp \
python39-zipp \
python3dist-zipp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
