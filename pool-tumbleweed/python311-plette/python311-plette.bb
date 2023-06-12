SUMMARY = "Structured Pipfile and Pipfile.lock models"
DESCRIPTION = "Structured Pipfile and Pipfile.lock models."
LICENSE = "ISC"

PV = "0.4.4"

RPM_NAME = "python311-plette-0.4.4-1.3.noarch.rpm"
RPM_HASH = "b4e6991db00fdec52371c40da6ed273c7bf56931c5d12a16df65b1c2698351cefbb427af6fa3aa6daaa042714d5b3e1a38039fde9a647888e494080add364ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(plette) \
python311-plette \
python3dist(plette)"
RDEPENDS:${PN} += "python(abi) \
python311-tomlkit"

inherit rpm
