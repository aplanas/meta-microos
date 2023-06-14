SUMMARY = "Validation library and CLI tool for checking on 'pyprojecttoml'"
DESCRIPTION = "Validation library and CLI tool for checking on 'pyproject.toml' files using JSON Schema"
LICENSE = "BSD-3-Clause & MIT & MPL-2.0"

PV = "0.13"

RPM_NAME = "python311-validate-pyproject-0.13-1.1.noarch.rpm"
RPM_HASH = "c114432d8817289d8aff73ef792228979fc40dd8640cba31b1f29aa90f9184de17a6d20fbb921b440c486be475fab9cd0034a29283ae220d4087ccfc85442fcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-validate-pyproject \
python311-validate-pyproject \
python3dist-validate-pyproject"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-fastjsonschema \
update-alternatives"

inherit rpm
