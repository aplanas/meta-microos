SUMMARY = "Validation library and CLI tool for checking on 'pyprojecttoml'"
DESCRIPTION = "Validation library and CLI tool for checking on 'pyproject.toml' files using JSON Schema"
LICENSE = "BSD-3-Clause & MIT & MPL-2.0"

PV = "0.13"

RPM_NAME = "python39-validate-pyproject-0.13-1.3.noarch.rpm"
RPM_HASH = "0ae677dae95d534675ff9c79ced9289280675f43f91fb029cbd758400c1da9360a201b71e535b93393ad320942aa4a0edbce1ba666eb6e0888ac7cda346a9bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-validate-pyproject \
python39-validate-pyproject \
python3dist-validate-pyproject"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-fastjsonschema \
update-alternatives"

inherit rpm
