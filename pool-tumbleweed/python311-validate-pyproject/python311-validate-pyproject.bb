SUMMARY = "Validation library and CLI tool for checking on 'pyprojecttoml'"
DESCRIPTION = "Validation library and CLI tool for checking on 'pyproject.toml' files using JSON Schema"
LICENSE = "BSD-3-Clause & MIT & MPL-2.0"

PV = "0.13"

RPM_NAME = "python311-validate-pyproject-0.13-1.3.noarch.rpm"
RPM_HASH = "cca693122122dd3433c3654f036f5eaa0bb04889288516b515ba623660e236bbfddd41ccebe53bea1fad02b1e69821bcfa05cc0f4152637c5500fff5dcb277e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-validate-pyproject \
python3.11dist-validate-pyproject \
python311-validate-pyproject \
python3dist-validate-pyproject"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-fastjsonschema \
update-alternatives"

inherit rpm
