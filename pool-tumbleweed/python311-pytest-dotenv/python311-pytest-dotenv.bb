SUMMARY = "A pytest plugin that parses environment files"
DESCRIPTION = "A py.test plugin that parses environment files before running tests."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python311-pytest-dotenv-0.5.2-1.14.noarch.rpm"
RPM_HASH = "52fa168765428e382a9c0653316abfd3557941d118978859448b19a7dcdb6ea136d2147f311a6dc16b4a10d04265d3cb267f1379a17ac54d345fbfbd3f18c5af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-dotenv \
python3.11dist-pytest-dotenv \
python311-pytest-dotenv \
python3dist-pytest-dotenv"

RDEPENDS:${PN} += "python-abi \
python311-pytest \
python311-python-dotenv"

inherit rpm
