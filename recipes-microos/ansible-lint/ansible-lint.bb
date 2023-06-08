SUMMARY = "Best practices checker for Ansible"
DESCRIPTION = "Checks playbooks for practices and behavior that could potentially be improved."
LICENSE = "MIT"

PV = "6.15.0"

RPM_NAME = "ansible-lint-6.15.0-1.1.noarch.rpm"
RPM_HASH = "88751f8f63f748d5c058226731399d2bcff4a24aac7c27ad6ad6042bf4138681086803b72b9ee9dd94560370acb85d1070746f55728ef29a1239e25065b5168b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-lint python3.10dist(ansible-lint) python3dist(ansible-lint)"
RDEPENDS:${PN} += "(python3-ruamel.yaml >= 0.17.21 and python3-ruamel.yaml < 0.18) /usr/bin/python3 ansible-core python(abi) python3-PyYAML python3-ansible-compat python3-black python3-bracex python3-enrich python3-filelock python3-jsonschema python3-packaging python3-rich python3-subprocess-tee python3-tenacity python3-wcmatch python3-yamllint"

inherit rpm
