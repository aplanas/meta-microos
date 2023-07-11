SUMMARY = "isort extension for flake8"
DESCRIPTION = "isort extension for flake8."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-flake8-imports-0.1.1-2.17.noarch.rpm"
RPM_HASH = "25621c5946983a5d1809dcadb80901bd985970a521171badd1c78e918cb7a88effd00b2e6e43b9e6474b9e75cc6aa67c45bc7108281b2f2545d39323663a7b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-imports \
python310-flake8-imports \
python3dist-flake8-imports"

RDEPENDS:${PN} += "python-abi \
python310-isort"

inherit rpm
