SUMMARY = "Python Data Validation"
DESCRIPTION = "Python Data Validation for Humans."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python39-validators-0.20.0-3.3.noarch.rpm"
RPM_HASH = "33fe57e43010726082916d0492be683d33b96ffd65b30019623961f007a9e9d9fdeee7c54af8e4405cfc19972191b35c92a46f4c42824f9c3f06d03c93e138c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-validators \
python39-validators \
python3dist-validators"

RDEPENDS:${PN} += "python-abi \
python39-decorator"

inherit rpm
