SUMMARY = "isort extension for flake8"
DESCRIPTION = "isort extension for flake8."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-flake8-imports-0.1.1-2.17.noarch.rpm"
RPM_HASH = "4439adf3d461a19e1ba2222caaa83f57d59f76b66314469b0aca284dabc3aecdca4b9ec3e49f896a4c80b3966639a8f68709849b297dd5aa7468ef6622a3a687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-imports \
python39-flake8-imports \
python3dist-flake8-imports"

RDEPENDS:${PN} += "python-abi \
python39-isort"

inherit rpm
