SUMMARY = "Python wrapper for the GitHub API"
DESCRIPTION = "Github3.py is wrapper for v3 of the GitHub API written in python."
LICENSE = "BSD-3-Clause"

PV = "4.0.1"

RPM_NAME = "python310-github3.py-4.0.1-1.1.noarch.rpm"
RPM_HASH = "6c214328593e571a756650bff4df13b374e5d8359ea470df67dda93ae9142da6cbc5cd428fb150e68239a1821790e01c57639fe0b7f1b265f49b4cb66f263103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-github3.py \
python310-github3.py \
python3dist-github3.py"

RDEPENDS:${PN} += "python-abi \
python310-PyJWT \
python310-jwcrypto \
python310-python-dateutil \
python310-requests \
python310-uritemplate"

inherit rpm
