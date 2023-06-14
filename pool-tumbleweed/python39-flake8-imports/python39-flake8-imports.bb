SUMMARY = "isort extension for flake8"
DESCRIPTION = "isort extension for flake8."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-flake8-imports-0.1.1-2.15.noarch.rpm"
RPM_HASH = "ea40b4f13d87d816ad2de00617b96dfc238a01e66f7c0d75fa9e112c19b9de1e297f0afbec414cb3da871b5676cad9c7bb88efbfe8b4e7ebdd02581b76fdbc39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-imports \
python39-flake8-imports \
python3dist-flake8-imports"

RDEPENDS:${PN} += "python-abi \
python39-isort"

inherit rpm
