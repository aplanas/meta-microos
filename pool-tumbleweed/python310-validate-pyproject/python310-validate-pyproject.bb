SUMMARY = "Validation library and CLI tool for checking on 'pyprojecttoml'"
DESCRIPTION = "Validation library and CLI tool for checking on 'pyproject.toml' files using JSON Schema"
LICENSE = "BSD-3-Clause & MIT & MPL-2.0"

PV = "0.13"

RPM_NAME = "python310-validate-pyproject-0.13-1.3.noarch.rpm"
RPM_HASH = "35fc1a9cb0463157cfc717d4b2d256c00f31798d98b2a31e3907190ac81cfbb28b5de61074b38a715a50bd86460fa9198bafd05d23ae4382596cbdd5191e5070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-validate-pyproject \
python310-validate-pyproject \
python3dist-validate-pyproject"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-fastjsonschema \
update-alternatives"

inherit rpm
