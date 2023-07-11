SUMMARY = "A pytest plugin that parses environment files"
DESCRIPTION = "A py.test plugin that parses environment files before running tests."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python310-pytest-dotenv-0.5.2-1.14.noarch.rpm"
RPM_HASH = "3b298fbd1b2457c884e65dab68b5191791572ee3273f4fe1a005671faa87a56bdc92cd4c238ad784c4806771cde0a314d02ad05301e9a9e0ca65cca1cd701d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-dotenv \
python310-pytest-dotenv \
python3dist-pytest-dotenv"

RDEPENDS:${PN} += "python-abi \
python310-pytest \
python310-python-dotenv"

inherit rpm
